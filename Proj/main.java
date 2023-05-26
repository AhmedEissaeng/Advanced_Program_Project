/*
*
*@Author:Ahmed Eissa Mahfouz
* ID:2001725
*@Author:Ahmed khamis said khamis
* ID:2001489
*@Author:Basel hany mahmoud
* ID:2000117
*@Author:Mohamed shawky mohamed
* ID:2001687
*@Author:Abdallah Mohamed Ibrahim Gabr
* ID:2001143
*
*/
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Label;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
public class main extends Application
{
    public static int f;
    public static block[] blocks=new block[40];
    public static ArrayList<Double> x1=new ArrayList<>();
    public static ArrayList<Double> y1=new ArrayList<>();
    public static ArrayList<Double> x2=new ArrayList<>();
    public static ArrayList<Double> y2=new ArrayList<>();
    public static ArrayList<Double> x3=new ArrayList<>();
    public static ArrayList<Double> y3=new ArrayList<>();
    public static ArrayList<Double> x4=new ArrayList<>();
    public static ArrayList<Double> y4=new ArrayList<>();
    public static ArrayList<Double> x5=new ArrayList<>();
    public static ArrayList<Double> y5=new ArrayList<>();
    public static ArrayList<Double> x6=new ArrayList<>();
    @Override
    public void start(Stage primaryStage) 
    {
        Pane p = new Pane();
        for (int i = 0; i < f; i++)
         {
            Rectangle r = new Rectangle(blocks[i].getL_p(),blocks[i].getT_p() , 50, 50); 
            r.setFill(Color.WHITE);
            r.setStroke(Color.BLACK);
            r.setStrokeWidth(3);
            r.setArcHeight(10);
            r.setArcWidth(10);
            Rectangle r1 = new Rectangle(blocks[i].getL_p()-2,blocks[i].getT_p()-2 , 54, 54);
            r1.setFill(null);
            r1.setStroke(Color.DODGERBLUE);
            r1.setStrokeWidth(3.5);
            r1.setArcHeight(10);
            r1.setArcWidth(10);
            Label l=new Label(blocks[i].getName());
            l.setTextFill(Color.BLUE.brighter());
            l.setLayoutX(blocks[i].getL_p()+1.5);
            l.setLayoutY(blocks[i].getT_p()+52.5);
            p.getChildren().addAll(r,r1);
            p.getChildren().add(l);
         }
        for(int z3=0;z3<x1.size();++z3)
        {
            if(y1.get(z3).equals(y2.get(z3)))
            {
                Line l1=new Line(x1.get(z3),y1.get(z3),x2.get(z3),y2.get(z3));
                l1.setStrokeWidth(1.3);
                p.getChildren().add(l1);
                Polygon triangle = new Polygon();
                triangle.getPoints().addAll(
                x2.get(z3), y2.get(z3), 
                x2.get(z3)-8, y2.get(z3)-6, 
                x2.get(z3)-8,  y2.get(z3)+6
            );
               triangle.setFill(Color.BLACK);
               p.getChildren().add(triangle); 
            }
            else if(x1.get(z3).equals(x2.get(z3)))
            {
                Line l2=new Line(x1.get(z3),y1.get(z3),x2.get(z3)-15,y1.get(z3));
                l2.setStrokeWidth(1.3);
                p.getChildren().add(l2);
                Line l3=new Line(x1.get(z3)-15,y1.get(z3),x2.get(z3)-15,y2.get(z3));
                l3.setStrokeWidth(1.3);
                p.getChildren().add(l3);
                Line l4=new Line(x1.get(z3)-15,y2.get(z3),x2.get(z3),y2.get(z3));
                l4.setStrokeWidth(1.3);
                p.getChildren().add(l4);
                Polygon triangle = new Polygon();
                triangle.getPoints().addAll(
                x2.get(z3), y2.get(z3), 
                x2.get(z3)-8, y2.get(z3)-6, 
                x2.get(z3)-8,  y2.get(z3)+6
        );
               triangle.setFill(Color.BLACK);
               p.getChildren().add(triangle);
            }
            else
            {
                Line l9=new Line(x1.get(z3),y1.get(z3),x1.get(z3)+17,y1.get(z3));
                l9.setStrokeWidth(1.3);
                p.getChildren().add(l9);
                Line l10=new Line(x1.get(z3)+17,y1.get(z3),x1.get(z3)+17,y2.get(z3));
                l9.setStrokeWidth(1.3);
                p.getChildren().add(l10);
                Line l11=new Line(x1.get(z3)+17,y2.get(z3),x2.get(z3),y2.get(z3));
                l9.setStrokeWidth(1.3);
                p.getChildren().add(l11);
                Polygon triangle = new Polygon();
                triangle.getPoints().addAll(
                x2.get(z3), y2.get(z3), 
                x2.get(z3)-8, y2.get(z3)-6, 
                x2.get(z3)-8,  y2.get(z3)+6
        );
               triangle.setFill(Color.BLACK);
               p.getChildren().add(triangle);
            }
        }
        for(int z4=0;z4<x5.size();++z4)
        {
            Line l5=new Line(x5.get(z4),y5.get(z4),x3.get(z4),y3.get(z4));
            l5.setStrokeWidth(1.3);
            p.getChildren().add(l5);
            Circle c=new Circle();
            c.setCenterX(x3.get(z4));
            c.setCenterY(y3.get(z4));
            c.setRadius(2.5);
            c.setFill(Color.BLACK);
            p.getChildren().add(c);
            }
        int f5=0;
        for(int z5=0;z5<x3.size();++z5)
        {
            Double te=0.0;
            Double ds=-1.0;
            for (int z6=0;z6<x4.size();++z6)
            {
                if(x4.get(z6).equals(ds))
                {
                    z6=z6+f5;
                    ++f5;
                    continue;
                }
                if(x4.get(z6).equals(te))
                {
                    break;
                }
                if(y3.get(z5).equals(y4.get(z6)))
                {
                    Line l8=new Line(x3.get(z5),y3.get(z5),x4.get(z6),y4.get(z6));
                    l8.setStrokeWidth(1.3);
                    p.getChildren().add(l8);
                    ++f5;
                    Polygon triangle = new Polygon();
                triangle.getPoints().addAll(
                x4.get(z6), y4.get(z6), 
                x4.get(z6)-8, y4.get(z6)-6, 
                x4.get(z6)-8,  y4.get(z6)+6
        );
               triangle.setFill(Color.BLACK);
               p.getChildren().add(triangle);
                    x4.set(z6,ds);
                    y4.set(z6,ds);
                }
                else
                {
                    Line l6=new Line(x3.get(z5),y3.get(z5),x3.get(z5),y4.get(z6));
                    l6.setStrokeWidth(1.3);
                    p.getChildren().add(l6);
                    Line l7=new Line(x3.get(z5),y4.get(z6),x4.get(z6),y4.get(z6));
                    l7.setStrokeWidth(1.3);
                    p.getChildren().add(l7);
                    ++f5;
                    Polygon triangle = new Polygon();
                triangle.getPoints().addAll(
                x4.get(z6), y4.get(z6), 
                x6.get(z6), y4.get(z6)-6, 
                x6.get(z6),  y4.get(z6)+6
        );
               triangle.setFill(Color.BLACK);
               p.getChildren().add(triangle);
                    x4.set(z6,ds);
                    y4.set(z6,ds);
                }
            }
        }
        Scene s = new Scene(p, 1300, 600);
        primaryStage.setTitle("SiMULINK");
        primaryStage.setScene(s);
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        try{
        String fi=args[0];
        File z=new File(fi);
        if (!fi.endsWith(".mdl")) 
            {
                throw new NotVaildAutosarFileException("Invalid file extension!");
            }
            if(z.length()==0)
            {
                throw new EmptyAutosarFileException("Empty file!");
            }
        FileInputStream file=new FileInputStream(fi);
        int data;
        StringBuilder x=new StringBuilder();
        while((data = file.read())!=-1)
            {
                x.append((char)data);
            }
        String d=x.toString();
        Scanner p = new Scanner(d);
        FileOutputStream e=new FileOutputStream("Example.xml");
        while(p.hasNextLine())
            {
                String a=p.nextLine();
                if((a.contains("<System>")))
                {
                    while(!(a.contains("</System>")))
                    {
                        e.write((a+"\n").getBytes());
                        a=p.nextLine();
                    }
                }
            }
            e.write("</System>".getBytes());
        FileInputStream last=new FileInputStream("Example.xml");
        int u;
        StringBuilder y=new StringBuilder();
        while((u = last.read())!=-1)
            {
                y.append((char)u);
            }
        String o=y.toString();
        Scanner j = new Scanner(o);
        Scanner u1 = new Scanner(o);
        ArrayList<Double> lef=new ArrayList<>();
        ArrayList<Double> to=new ArrayList<>();
        ArrayList<String> nam=new ArrayList<>();
        ArrayList<String> mir=new ArrayList<>();
        ArrayList<String> id=new ArrayList<>();
        ArrayList<Integer> pn=new ArrayList<>();
        ArrayList<String> src=new ArrayList<>();
        ArrayList<String> dst=new ArrayList<>();
        ArrayList<String> dst_b=new ArrayList<>();
        ArrayList<String> in=new ArrayList<>();
        ArrayList<String> in_b=new ArrayList<>();
        ArrayList<String> addi=new ArrayList<>();
        ArrayList<Integer> addi_1=new ArrayList<>();
        while(j.hasNextLine())
             {
                String q=j.nextLine();
                int ports=0;
                if(q.contains("Block BlockType"))
                {
                    f++;
                    String b_Name=q.substring(q.indexOf(" Name=\"")+7,q.indexOf("\" SID"));
                    String b_ID=q.substring(q.indexOf(" SID=\"")+6,q.indexOf("\">"));
                    nam.add(b_Name);
                    id.add(b_ID);
                    q=j.nextLine();
                    if(q.contains("<P Name=\"Ports"))
                {
                    String por;
                    if(q.length()>=28)
                    {
                        por=q.substring(q.indexOf(">[")+2,q.indexOf("]<")-3);
                        ports=Integer.parseInt(por);
                    }
                    else
                    {
                        por=q.substring(q.indexOf(">[")+2,q.indexOf("]<"));
                        ports=Integer.parseInt(por);
                    }
                    q=j.nextLine();
                    pn.add(ports);
                }
                else 
                {
                    ports=1;
                    pn.add(ports);
                }
                }
                if(q.contains("<P Name=\"Position"))
                {
                    String b_left=q.substring(q.indexOf(">[")+2,q.indexOf("]<")-10);
                    String[] com=b_left.split(",");
                    double left=Double.parseDouble(com[0]);
                    String b_top=q.substring(q.indexOf(">[")+7,q.indexOf("]<")-6);
                    String[] com1=b_top.split(",");
                    double top=Double.parseDouble(com1[0]);
                    lef.add(left);
                    to.add(top);
                }
             }
             for(int r=0;r<lef.size();++r)
             {
                blocks[r] = new block();
                blocks[r].setName(nam.get(r));
                blocks[r].setId(id.get(r));
                blocks[r].setL_p(lef.get(r));
                blocks[r].setT_p(to.get(r));
                blocks[r].setPorno(pn.get(r));
                mir.add("null");
             }
             int f1=0;
             while(u1.hasNextLine())
             {
                String w=u1.nextLine();
                if(w.contains("Block BlockType"))
                { 
                    while(!w.contains("</Block>"))
                    {
                        w=u1.nextLine();
                        if(w.contains("<P Name=\"BlockMirror"))
                        {
                            String mirror=w.substring(w.indexOf("<P Name=\"BlockMirror")+22,w.indexOf("</P>"));
                            mir.set(f1,mirror); 
                        }
                        
                    }
                    f1++;
                }
                if(w.contains("<Line>"))
                {   
                    while(!w.contains("</Line>"))
                    {
                        w=u1.nextLine();
                        w=u1.nextLine();
                       String d1=w.substring(w.indexOf("\"Src\">")+6,w.indexOf("#out:"));
                       src.add(d1);
                       w=u1.nextLine();
                        if(w.contains("Name=\"Points\">"))
                        {
                            w=u1.nextLine();
                        }
                        if(w.contains("<P Name=\"Dst\""))
                        {
                            String d3=w.substring(w.indexOf("\"Dst\">")+6,w.indexOf("#in:"));
                            dst.add(d3);
                            String d4=w.substring(w.indexOf("#in:")+4,w.indexOf("</P"));
                            in.add(d4);
                            w=u1.nextLine();
                        }
                        String d6="null";
                        if(w.contains("<Branch>"))
                        {
                            int d4=0;
                            while(w.contains("<Branch>"))
                            {
                                ++d4;
                                while(!w.contains("<P Name=\"Dst\">"))
                            {
                                w=u1.nextLine();
                            }
                            String d2=w.substring(w.indexOf("\"Dst\">")+6,w.indexOf("#in:"));
                            dst_b.add(d2);
                            String d5=w.substring(w.indexOf("#in:")+4,w.indexOf("</P"));
                            in_b.add(d5);
                            w=u1.nextLine();
                            w=u1.nextLine(); 
                        }
                        addi_1.add(d4);
                       }
                       else 
                       {
                        d6="0";
                       }
                       addi.add(d6);
                    }
                }
             }        
           for(int q3=0;q3<src.size();++q3)
             {
                for(int q4=0;q4<f;++q4)
                {
                    if(src.get(q3).equals(blocks[q4].getId()))
                    {
                        double e4;
                        double e5;
                        double d8;
                        double d9;
                        if(addi.get(q3).equals("null"))
                        {
                            if(mir.get(q4).equals("on"))
                        {
                            e4=blocks[q4].getL_p();
                            e5=blocks[q4].getT_p()+25;
                            d8=blocks[q4].getL_p()-20;
                            d9=blocks[q4].getT_p()+25;
                        }
                            else 
                        {
                            e4=blocks[q4].getL_p()+50;
                            e5=blocks[q4].getT_p()+25;
                            d8=blocks[q4].getL_p()+80;
                            d9=blocks[q4].getT_p()+25;
                        }
                            x5.add(e4);
                            y5.add(e5);
                            x3.add(d8);
                            y3.add(d9);
                        }
                        else 
                        {
                            if(mir.get(q4).equals("on"))
                        {
                            e4=blocks[q4].getL_p();
                            e5=blocks[q4].getT_p()+25;
                        }
                        else 
                        {
                            e4=blocks[q4].getL_p()+50;
                          e5=blocks[q4].getT_p()+25;
                        }
                        x1.add(e4);
                        y1.add(e5);
                        }
                    }
                }
             }
             for(int r2=0;r2<dst.size();++r2)
             {
                for(int r3=0;r3<f;++r3)
                {
                    if(dst.get(r2).equals(blocks[r3].getId()))
                    {
                        double e5=0;
                        double e6=0;
                        if(mir.get(r3).equals("on"))
                        {
                            if(in.get(r2).equals("1"))
                        {
                            e5=blocks[r3].getL_p()+50;
                           e6=blocks[r3].get_pos()+blocks[r3].getT_p();
                        }
                        if(in.get(r2).equals("2"))
                        {
                            e5=blocks[r3].getL_p()+50;
                           e6=2*blocks[r3].get_pos()+blocks[r3].getT_p();
                        }
                        if(in.get(r2).equals("3"))
                        {
                            e5=blocks[r3].getL_p()+50;
                           e6=3*blocks[r3].get_pos()+blocks[r3].getT_p();
                        }
                        if(in.get(r2).equals("4"))
                        {
                            e5=blocks[r3].getL_p()+50;
                           e6=4*blocks[r3].get_pos()+blocks[r3].getT_p();
                        }
                        if(in.get(r2).equals("5"))
                        {
                            e5=blocks[r3].getL_p()+50;
                           e6=5*blocks[r3].get_pos()+blocks[r3].getT_p();
                        }
                        if(in.get(r2).equals("6"))
                        {
                            e5=blocks[r3].getL_p()+50;
                           e6=6*blocks[r3].get_pos()+blocks[r3].getT_p();
                        }
                        }
                        else
                        {
                        if(in.get(r2).equals("1"))
                        {
                            e5=blocks[r3].getL_p();
                           e6=blocks[r3].get_pos()+blocks[r3].getT_p();
                        }
                        if(in.get(r2).equals("2"))
                        {
                            e5=blocks[r3].getL_p();
                           e6=2*blocks[r3].get_pos()+blocks[r3].getT_p();
                        }
                        if(in.get(r2).equals("3"))
                        {
                            e5=blocks[r3].getL_p();
                           e6=3*blocks[r3].get_pos()+blocks[r3].getT_p();
                        }
                        if(in.get(r2).equals("4"))
                        {
                            e5=blocks[r3].getL_p();
                           e6=4*blocks[r3].get_pos()+blocks[r3].getT_p();
                        }
                        if(in.get(r2).equals("5"))
                        {
                            e5=blocks[r3].getL_p();
                           e6=5*blocks[r3].get_pos()+blocks[r3].getT_p();
                        }
                        if(in.get(r2).equals("6"))
                        {
                            e5=blocks[r3].getL_p();
                           e6=6*blocks[r3].get_pos()+blocks[r3].getT_p();
                        }
                    }
                        x2.add(e5);
                        y2.add(e6);
                   }  
               }
             }
             for(int r6=0;r6<dst_b.size();++r6)
             {
                for(int r7=0;r7<f;++r7)
                {
                    if(dst_b.get(r6).equals(blocks[r7].getId()))
                    {
                        double e5=0;
                        double e6=0;
                        double e7=0;
                        if(mir.get(r7).equals("on"))
                        {
                        if(in_b.get(r6).equals("1"))
                        {
                            e5=blocks[r7].getL_p()+50;
                           e6=blocks[r7].get_pos()+blocks[r7].getT_p();
                           e7=blocks[r7].getL_p()+58;
                        }
                        if(in_b.get(r6).equals("2"))
                        {
                            e5=blocks[r7].getL_p()+50;
                           e6=2*blocks[r7].get_pos()+blocks[r7].getT_p();
                           e7=blocks[r7].getL_p()+58;
                        }
                        if(in_b.get(r6).equals("3"))
                        {
                            e5=blocks[r7].getL_p()+50;
                           e6=3*blocks[r7].get_pos()+blocks[r7].getT_p();
                           e7=blocks[r7].getL_p()+58;
                        }
                        if(in_b.get(r6).equals("4"))
                        {
                            e5=blocks[r7].getL_p()+50;
                           e6=4*blocks[r7].get_pos()+blocks[r7].getT_p();
                           e7=blocks[r7].getL_p()+58;
                        }
                        if(in_b.get(r6).equals("5"))
                        {
                            e5=blocks[r7].getL_p()+50;
                           e6=5*blocks[r7].get_pos()+blocks[r7].getT_p();
                           e7=blocks[r7].getL_p()+58;
                        }
                        if(in_b.get(r6).equals("6"))
                        {
                            e5=blocks[r7].getL_p()+50;
                           e6=6*blocks[r7].get_pos()+blocks[r7].getT_p();
                           e7=blocks[r7].getL_p()+58;
                        }
                      }
                      else 
                        {
                        if(in_b.get(r6).equals("1"))
                        {
                            e5=blocks[r7].getL_p();
                           e6=blocks[r7].get_pos()+blocks[r7].getT_p();  
                           e7=blocks[r7].getL_p()-8;
                        }
                        if(in_b.get(r6).equals("2"))
                        {
                            e5=blocks[r7].getL_p();
                           e6=2*blocks[r7].get_pos()+blocks[r7].getT_p();
                           e7=blocks[r7].getL_p()-8;
                        }
                        if(in_b.get(r6).equals("3"))
                        {
                            e5=blocks[r7].getL_p();
                           e6=3*blocks[r7].get_pos()+blocks[r7].getT_p();
                           e7=blocks[r7].getL_p()-8;
                        }
                        if(in_b.get(r6).equals("4"))
                        {
                            e5=blocks[r7].getL_p();
                           e6=4*blocks[r7].get_pos()+blocks[r7].getT_p();
                           e7=blocks[r7].getL_p()-8;
                        }
                        if(in_b.get(r6).equals("5"))
                        {
                            e5=blocks[r7].getL_p();
                           e6=5*blocks[r7].get_pos()+blocks[r7].getT_p();
                           e7=blocks[r7].getL_p()-8;
                        }
                        if(in_b.get(r6).equals("6"))
                        {
                            e5=blocks[r7].getL_p();
                           e6=6*blocks[r7].get_pos()+blocks[r7].getT_p();
                           e7=blocks[r7].getL_p()-8;
                        }
                      }
                        x4.add(e5);
                        y4.add(e6);
                        x6.add(e7);
                   }  
               }
          } 
          for(int i5=1;i5<addi_1.size();++i5)
            {
                addi_1.set(i5,addi_1.get(i5-1)+addi_1.get(i5)+1);
            }
            Double i6=0.0;
            for(int i7=0;i7<addi_1.size();++i7)
            {
                x4.add(addi_1.get(i7),i6);
                y4.add(addi_1.get(i7),i6);
                x6.add(addi_1.get(i7),i6);
            }
          
          Application.launch(args); 
      }
            catch(FileNotFoundException e)
        {
            e=new FileNotFoundException("File Not Found!");
        }
        catch(IOException e)
        {
            e=new IOException("IO Exception");
        }
        catch (NotVaildAutosarFileException e)
        {
            e=new NotVaildAutosarFileException("Invalid file extention!");
        }
        catch (NullPointerException e)
        {
            e=new NullPointerException("NullPointer Exception");
        }
    } 
}
class EmptyAutosarFileException extends RuntimeException
{
    public EmptyAutosarFileException(String m)
    {
        System.out.println(m);
    }
}
class NotVaildAutosarFileException extends Exception
{
    public NotVaildAutosarFileException(String m)
    {
        System.out.println(m);
    }
}
class block
{
    private String id;
    private String name;
    private double topPosition;
    private double leftPosition;
    private int noOfPorts;
    public void setId(String i)
    {
        this.id=i;
    }
    public void setName(String n)
    {
        this.name=n;
    }
    public void setL_p(double l)
    {
        this.leftPosition=l;
    }
    public void setT_p(double t)
    {
        this.topPosition=t;
    }
    public void setPorno(int num)
    {
        this.noOfPorts=num;
    }
    public String getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public double getL_p()
    {
        return this.leftPosition;
    }
    public double getT_p()
    {
        return this.topPosition;
    }
    public int getPorno()
    {
        return this.noOfPorts;
    }
    public double get_pos()
    {
        return 50.0/(this.getPorno()+1.0);
    }
}
