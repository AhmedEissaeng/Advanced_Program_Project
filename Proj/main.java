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
