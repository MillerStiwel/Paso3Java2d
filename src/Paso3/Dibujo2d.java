package Paso3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.*;


public class Dibujo2d {
   
   //funciones para Bruja 
   public static void Bruja(Graphics g){
       
       Sombrero(g);
       Pelo(g);
       Rostro(g);
       Ojos(g);
       Cuerpo(g);
       Manos(g);
       Piernas(g);
       Escoba(g);
       Luna(g);
   }
            
   public static void Pelo (Graphics g){
       
        int[] X={49, 4, 11, 40, 18, 28, 48, 35, 45, 69};
        int[] Y={103, 142, 152, 124, 151, 160, 134, 167, 178, 104};
        
        int[] X2={133, 157, 167, 153, 173, 182, 163, 190, 200, 154};
        int[] Y2={103, 176, 166, 133, 159, 151, 124, 152, 142, 104};
        
        g.setColor(Color.BLACK);
        
        g.fillPolygon(X,Y,10);
        g.fillPolygon(X2,Y2,10);
        
        g.setColor(Color.BLACK);
        g.drawLine(4, 142, 48, 104);
        g.drawLine(4, 142, 11, 152);
        g.drawLine(11, 152, 40, 124);
        g.drawLine(40, 124, 18, 151);
        g.drawLine(18, 151, 28, 160);
        g.drawLine(28, 160, 48, 133);
        g.drawLine(48, 133, 35, 167);
        g.drawLine(35, 167, 44, 177);
        g.drawLine(44, 177, 68, 104);
        g.drawLine(133, 103, 157, 176);
        g.drawLine(157, 176, 167, 166);
        g.drawLine(167, 166, 153, 133);
        g.drawLine(153, 133, 173, 159);
        g.drawLine(173, 159, 182, 151);
        g.drawLine(182, 151, 162, 124);
        g.drawLine(162, 124, 190, 152);
        g.drawLine(190, 152, 200, 142);
        g.drawLine(200, 142, 153, 104); 
       
   } 
    
   static public void Ojos(Graphics g){
       
       
        int[] X_o={67, 67, 95, 95};
        int[] Y_o={135, 110, 110, 135};
        
        int[] Xo_={108, 108, 134, 134};
        int[] Yo_={135, 109, 109, 134};
        
        int[] Xp={76, 76, 95, 95};
        int[] Yp={135, 117, 117, 135};
        
        int[] Xp1={108, 108, 127, 127};
        int[] Yp1={135, 117, 117, 135};
        
        g.setColor(Color.WHITE);
        g.fillPolygon(Xo_,Yo_,4);
        g.fillPolygon(X_o,Y_o,4);

        g.setColor(Color.BLACK);
        g.fillPolygon(Xp,Yp,4);
        g.fillPolygon(Xp1,Yp1,4);
        
        
        g.drawLine(67, 135, 67, 110);
        g.drawLine(67, 110, 95, 110);
        g.drawLine(95, 110, 95, 135);
        g.drawLine(76, 117, 95, 117);
        g.drawLine(76, 117, 76, 135);
        g.drawLine(108, 109, 134, 109);
        g.drawLine(108, 109, 108, 135);
        g.drawLine(108, 135, 134, 135);
        g.drawLine(134, 109, 134, 135);
        g.drawLine(109, 117, 127, 117);
        g.drawLine(127, 117, 127, 135);
   
   } 
    
   public static void Sombrero(Graphics g){
       
        // Triangulo
        int[] X={50, 103, 134, 116, 150};
        int[] Y={93, 6, 29, 29, 93};
        //base
        int[] X1={10, 10, 190, 190};
        int[] Y1={103, 93, 93, 103};
        //cuadro grande
        int[] X2={85, 85, 117, 117};
        int[] Y2={53, 86, 86, 53};
        //cuadro pequeño
        int[] X3={111, 111, 92, 92};
        int[] Y3={80, 61, 61, 80};
        
        //franja
        int[] X4={85, 85, 70, 59};
        int[] Y4={78, 61, 61, 78};
        int[] X5={118, 118, 142, 133};
        int[] Y5={61, 79, 79, 61};
        
        //COLORES
        Color Uva = new Color(129,22,168);
       
        //Pintamos triangulo
        g.setColor(Uva);
        //base
        g.fillPolygon(X,Y,5);
        g.fillPolygon(X1,Y1,4);
        
        //Color adorno sombrero
        Color Ama = new Color(237,247,12);
       //adorno
        g.setColor(Ama);
        g.fillPolygon(X2,Y2,4);
       
        g.setColor(Color.BLACK);
        g.fillPolygon(X3,Y3,4);
        
         //Cinta del gorro
        g.fillPolygon(X4,Y4,4);
        g.fillPolygon(X5,Y5,4);
       
        
        //delineado 
        g.setColor(Color.BLACK);
        
        g.drawLine(50, 93, 103, 6);
        g.drawLine(103, 6, 133, 29);
        g.drawLine(133, 29, 116, 29);
        g.drawLine(150, 93, 116, 29);
        
        g.drawLine(10, 93, 10, 102);
        g.drawLine(10, 93, 190, 93);
        g.drawLine(190, 93, 190, 102);
        g.drawLine(10, 103, 190, 103);
        
        g.drawLine(85, 53, 117, 53);
        g.drawLine(85, 86, 117, 86);
        g.drawLine(85, 53, 85, 86);
        g.drawLine(117, 53, 117, 86);
        
        g.drawLine(92, 61, 111, 61);
        g.drawLine(92, 80, 111, 80);
        g.drawLine(92, 61, 92, 80);
        g.drawLine(111, 61, 111, 80);
        
        g.drawLine(84, 61, 69, 61);
        g.drawLine(84, 78, 59, 78);
        g.drawLine(118, 61, 133, 61);
        g.drawLine(118, 79, 142, 79);
   }
   
   public static void Rostro(Graphics g){
       
        //cara
        int[] X={53, 53, 77, 128, 149, 149, 133, 68};
        int[] Y={153, 167, 191, 191, 168, 151, 103, 104};
        
        //COLORES
        Color Verde = new Color(109,224,88);
        
        g.setColor(Verde);
        g.fillPolygon(X,Y,8);
                       
        g.setColor(Color.BLACK);
        g.drawLine(53, 154, 53, 168);
        g.drawLine(53, 168, 77, 191);
        g.drawLine(77, 191, 127, 191);
        g.drawLine(127, 191, 149, 168);
        g.drawLine(149, 168, 149, 153);
        
        //Nariz
        g.drawLine(109, 151, 60, 151);
        g.drawLine(60, 151, 60, 135);
        g.drawLine(60, 135, 133, 135);
        
        //boca
        g.drawLine(76, 159, 76, 168);
        g.drawLine(76, 168, 84, 175);
        g.drawLine(84, 175, 118, 175);
        g.drawLine(118, 175, 125, 167);
        g.drawLine(125, 167, 126, 158);
         
   }
   
   public static void Manos (Graphics g){
        //mano de
        int[] XMD={20, 20, 28, 36, 36};
        int[] YMD={256, 247, 239, 247, 256};
        //mano is
        int[] XMI={175, 183, 199, 190, 182, 182, 174};
        int[] YMI={182, 192, 183, 167, 174, 167, 166};
        
        int[] X_D={27, 77, 68, 37};
        int[] Y_D={239, 189, 218, 248};
        
        int[] X_I={126, 175, 183, 135};
        int[] Y_I={191, 182, 192, 215};
        
        //Color brazos
        Color Uva = new Color(129,22,168);
        
        //Color Manos
        Color Verde = new Color(109,224,88);

        //Manos
        g.setColor(Verde);
        g.fillPolygon(XMD,YMD,5);
        g.fillPolygon(XMI,YMI,7);
        
        //Brazos
        g.setColor(Uva);
        g.fillPolygon(X_D,Y_D,4);
        g.fillPolygon(X_I,Y_I,4);
        
        
        
        g.setColor(Color.BLACK);
        g.drawLine(75, 190, 20, 246);
        g.drawLine(20, 246, 20, 255);
        g.drawLine(28, 239, 36, 247);
        g.drawLine(36, 247, 36, 255);
        g.drawLine(36, 247, 65, 219);
        
        g.drawLine(126, 190, 175, 182);
        g.drawLine(175, 182, 183, 191);
        g.drawLine(183, 191, 134, 215);
        g.drawLine(174, 183, 174, 166);
        g.drawLine(174, 166, 182, 166);
        
        g.drawLine(182, 166, 182, 174);
        g.drawLine(182, 174, 190, 167);
        g.drawLine(190, 167, 198, 183);
        g.drawLine(198, 183, 183, 191);
        
       
        
        
   }
   
   public static void Piernas(Graphics g){
       
        int[] puntosX20={77, 92, 109, 110, 101, 94};
        int[] puntosY20={264, 296, 296, 288, 288, 264};
     
        int[] puntosX21={109, 126, 132, 142, 142, 124};
        int[] puntosY21={264, 263, 278, 278, 288, 288};
         
        int[] puntosX22={110, 110, 116, 116};
        int[] puntosY22={288, 296, 296, 289};
        
        int[] puntosX23={142, 142, 148, 148};
        int[] puntosY23={288, 278, 278, 288};
        
        int[] puntosX26={116, 117, 134, 134, 125};
        int[] puntosY26={297, 288, 288, 314, 297};
        
        int[] puntosX24={148, 148, 167, 167, 158};
        int[] puntosY24={288, 278, 278, 303, 289};
        
        int[] puntosX25={108, 108, 127, 127};
        int[] puntosY25={135, 117, 117, 135};
        
        
        //Color Manos
        Color Verde = new Color(109,224,88);
        
        g.setColor(Verde);
        g.fillPolygon(puntosX20,puntosY20,6);
        g.fillPolygon(puntosX21,puntosY21,6);
        
        //Color Medias
        Color Ama = new Color(237,247,12);
        //Medias
        g.setColor(Ama);
        g.fillPolygon(puntosX22,puntosY22,4);
        g.fillPolygon(puntosX23,puntosY23,4);
        
        //Zapatos
        g.setColor(Color.BLACK);
        g.fillPolygon(puntosX26,puntosY26,5);
        g.fillPolygon(puntosX24,puntosY24,5);
        g.fillPolygon(puntosX25,puntosY25,4);
        
        g.drawLine(77, 264, 92, 296);
        g.drawLine(94, 264, 101, 287);
        g.drawLine(92, 296, 125, 296);
        g.drawLine(101, 287, 157, 288);
        
        g.drawLine(108, 264, 124, 287);
        g.drawLine(126, 264, 133, 278);
        g.drawLine(133, 278, 166, 278);
        
        g.drawLine(166, 278, 167, 303);
        g.drawLine(157, 288, 167, 303);
        g.drawLine(134, 288, 134, 314);
        g.drawLine(125, 296, 134, 314);
        
        g.drawLine(109, 288, 109, 296);
        g.drawLine(116, 288, 116, 296);
        g.drawLine(141, 279, 141, 288);
        g.drawLine(148, 279, 148, 288);
   }
   
   public static void Cuerpo (Graphics g){
       //Color
        Color Uva = new Color(129,22,168);
       //Cuerpo
        int[] X={51, 51, 77, 126, 150, 150};
        int[] Y={263, 255, 191, 191, 255, 263};
        g.setColor(Uva);
        g.fillPolygon(X,Y,6);
        
        g.setColor(Color.BLACK);
        g.drawLine(51, 254, 77, 192);
        g.drawLine(126, 192, 150, 255);
        g.drawLine(52, 255, 52, 263);
        g.drawLine(150, 255, 150, 263);
        g.drawLine(52, 263, 150, 263);
        
       
        
        
       
   }
   
   public static void Escoba(Graphics g){
         
        int[] X={10, 10, 52, 52};
        int[] Y={263, 256, 256, 263};
        
        int[] X1={150, 191, 191, 150};
        int[] Y1={256, 256, 263, 263};
        
        int[] X2={191, 198, 272, 272, 198, 191};
        int[] Y2={256, 230, 230, 288, 288, 263};
        
        //Madera
        g.setColor(new Color (229,193,37));
        
        g.fillPolygon(X,Y,4);
        g.fillPolygon(X1,X1,4);
        
        //Mechas
        g.setColor(new Color (229,193,37));
        g.fillPolygon(X2,Y2,6);
        
        g.setColor(Color.BLACK);
        g.drawLine(10, 256, 52, 256);
        g.drawLine(10, 256, 10, 263);
        g.drawLine(10, 263, 52, 263);
        g.drawLine(150, 256, 190, 256);
        g.drawLine(150, 263, 190, 263);
        g.drawLine(191, 256, 191, 263);
        g.drawLine(191, 256, 199, 230);
        g.drawLine(199, 230, 272, 230);
        g.drawLine(272, 230, 272, 288);
        g.drawLine(272, 288, 198, 288);
        g.drawLine(198, 288, 190, 263);

   }
   
   public static void Luna(Graphics g){
      //A = (452,-50.7)
      //B = (481.1,-50.9)
      //C = (500.1,-70.8)
      //D = (499.1,-115.8)
      //E = (486.1,-139.7)
      //F = (452.2,-139.7)
      //G = (480,-120)
      //H = (481.1,-77.8)
      
      int[] X ={251,280,299,298,285,251,280,100};
      int[] Y ={-25,-26,-45,-90,-114,-115,-94,-52};
      g.setColor(Color.red);
      g.fillPolygon(X,Y,16);
      g.setColor(Color.black);
      g.drawPolygon(X,Y,16);
           
                 }
         
   public static void Panda(Graphics g){
        //Orejas
        int[] X1={55, 18, 58, 110};
        int[] Y1={174, 93, 29, 65};
        
        int[] X2={271, 326, 366, 329};
        int[] Y2={65, 29, 93, 175};
        
        //Cara
        int[] X3={110, 33, 65, 162};
        int[] Y3={65, 217, 303, 144};
        
        int[] X4={95, 65, 138, 126};
        int[] Y4={255, 303, 333, 277};
        
        int[] X5={271, 351, 319, 222};
        int[] Y5={65, 217, 303, 143};
        
        int[] X6={319, 290, 257, 245};
        int[] Y6={303, 254, 277, 331};
        
        int[] X7={138, 154, 190, 227, 245, 225, 211, 190, 171, 158};
        int[] Y7={333, 355, 365, 356, 331, 340, 333, 340, 331, 341};
        
        int[] X8={189, 270, 222, 234, 257, 245, 225, 211, 190, 171, 158, 138, 126, 150, 162, 110, 189};
        int[] Y8={44, 66, 143, 241, 277, 331, 340, 333, 340, 331, 341, 333, 277, 240, 144, 65, 44};
        
        int[] X9={95, 162, 150, 126};
        int[] Y9={255, 144, 240, 277};
        
        int[] X10={257, 290, 223, 234};
        int[] Y10={277, 253, 141, 241};
        
        int[] X11={148, 191, 234, 220, 195, 195, 212, 191, 172, 189, 188, 163, 148};
        int[] Y11={297, 301, 296, 312, 318, 325, 332, 340, 332, 326, 318, 312, 297};
        
        g.drawPolygon(X1,Y1,4);
        g.setColor(Color.BLACK);
        g.fillPolygon(X1,Y1,4);
        
        
        g.drawPolygon(X2,Y2,4);
        g.setColor(Color.BLACK);
        g.fillPolygon(X2,Y2,4);
        
        
        
        g.setColor(Color.BLACK);
        g.drawPolygon(X3,Y3,4);
        g.setColor(Color.WHITE);
        g.fillPolygon(X3,Y3,4);
        
        
        
        g.setColor(Color.BLACK);
        g.drawPolygon(X4,Y4,4);
        g.setColor(Color.WHITE);
        g.fillPolygon(X4,Y4,4);
        
        
        g.setColor(Color.BLACK);
        g.drawPolygon(X5,Y5,4);
        g.setColor(Color.WHITE);
        g.fillPolygon(X5,Y5,4);
        
       
        g.setColor(Color.BLACK);
        g.drawPolygon(X6,Y6,4);
        g.setColor(Color.WHITE);
        g.fillPolygon(X6,Y6,4);
        
       
        g.setColor(Color.BLACK);
        g.drawPolygon(X7,Y7,10);
        g.setColor(Color.WHITE);
        g.fillPolygon(X7,Y7,10);
        
        
        g.setColor(Color.BLACK);
        g.drawPolygon(X8,Y8,17);
        g.setColor(Color.WHITE);
        g.fillPolygon(X8,Y8,17);
        
        
        g.drawPolygon(X9,Y9,4);
        g.setColor(Color.BLACK);
        g.fillPolygon(X9,Y9,4);
        
       
        g.drawPolygon(X10,Y10,4);
        g.setColor(Color.BLACK);
        g.fillPolygon(X10,Y10,4);
        
        
        
        g.setColor(Color.BLACK);
        g.fillPolygon(X11,Y11,13);

   }
    
   public static void paisaje(Graphics g){
       
       Graphics2D g2 = (Graphics2D) g;
        
        //playa
        g.setColor(new Color(103,206,2));
        g.fillRect(0, 320,1020 ,300 );
        //noche
        g.setColor(new Color(44,80,146));
        g.fillRect(0, 0,1020 ,320 ); 
        
        //atardecer
        g.setColor(new Color(253,171,2));
        g.fillOval(150,40,100 ,100 ); 
        
        

        //montañas
        g.setColor(new Color(0,145,0));
        Polygon p = new Polygon ();
        
        int xPoly4[]= {180, 300, 40};
        int yPoly4[]= {150, 300, 300};
        g2.fillPolygon(xPoly4, yPoly4, xPoly4.length);
        
        int xPoly3[]= {300, 400, 150};
        int yPoly3[]= {110, 250, 300};
        g2.fillPolygon(xPoly3, yPoly3, xPoly3.length);
        
        int xPoly[]= {450, 600, 300};
                    //alt 
        int yPoly[]= {100, 300, 300};
        g2.fillPolygon(xPoly, yPoly, xPoly.length);
   
        int xPoly2[]= {600, 750, 450};
        int yPoly2[]= {150, 300, 300};
        g2.fillPolygon(xPoly2, yPoly2, xPoly2.length);
        
        
        
       
        //agua y tierra
        Color Cafe = new Color(114,80,36);
        g.setColor(Cafe);
        g.fillRect(0, 250, 1020, 400); 
        g.setColor(Color.blue);
        g.fillRect(0, 250, 1020, 200); 
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.yellow);
        float[] dash = {20.0f};
        BasicStroke strok = new BasicStroke(3.0f, BasicStroke.CAP_SQUARE,
        BasicStroke.JOIN_MITER, 1.0f, dash, 0.0f);
        g2d.setStroke(strok);

    
 
        //arbustos
        g.setColor(new Color(0,140,0));
        g.drawOval(180, 500, 30,30);
        g.drawOval(205, 500, 30,30);
        g.drawOval(230, 500, 30,30);
        g.drawOval(195, 480, 30,30);
        g.drawOval(212, 480, 30,30);

       

        g.drawOval(390, 550, 30,30);
        g.drawOval(415, 550, 30,30);
        g.drawOval(440, 550, 30,30);
        g.drawOval(405, 530, 30,30);
        g.drawOval(422, 530, 30,30);

      
        g.drawOval(600, 500, 30,30);
        g.drawOval(625, 500, 30,30);
        g.drawOval(650, 500, 30,30);
        g.drawOval(615, 480, 30,30);
        g.drawOval(632, 480, 30,30);

     
        g.drawOval(780, 550, 30,30);
        g.drawOval(805, 550, 30,30);
        g.drawOval(830, 550, 30,30);
        g.drawOval(795, 530, 30,30);
        g.drawOval(812, 530, 30,30);
        
        g.drawOval(960, 500, 30,30);
        g.drawOval(985, 500, 30,30);
        g.drawOval(1010, 500, 30,30);
        g.drawOval(975, 480, 30,30);
        g.drawOval(992, 480, 30,30); 

       
       
        
        //nubes
        g.setColor(Color.white);
        g.fillOval(30,70,100,50);
        g.fillOval(90,70,90,40);
        g.fillOval(125,70,100,50);

        g.fillOval(330,70,100,50);
        g.fillOval(390,70,90,40);
        g.fillOval(425,70,100,50);

        g.fillOval(590,70,100,50);
        g.fillOval(630,70,90,40);
        g.fillOval(690,70,100,50);

        //g.fillOval(750,70,100,50);
        g.fillOval(950,70,90,40);
        g.fillOval(820,70,100,50);        
       
        // camping
        g.setColor(Color.GRAY);
        int[] x={210,300,80};
        int[] y={400,600,600};
        g.fillPolygon(x,y,3);
        
        
   } 
   
   public static void Abeja(Graphics g){
       
       //cuerpo
       
        g.setColor(Color.black);
        g.drawOval(180,170,250,160);
        g.setColor(Color.yellow);
        g.fillOval(180,170,250,160);
        
        g.setColor(Color.black);
        g.fillArc(190, 175, 150, 150, 90, 180);
        
        
        g.setColor(Color.yellow);
        g.fillArc(220, 175, 150, 150, 90, 180);
      

        
        g.setColor(Color.black);
        g.fillArc(260, 175, 150, 155, 90, 180);
        
        g.setColor(Color.yellow);
        g.fillArc(300, 175, 110, 150, 90, 180);
        
        //Ojos Contorno
        g.setColor(Color.black);
        g.drawOval(360,130,96,120);
        g.drawOval(290,130,96,120);
        
        g.setColor(Color.white);
        g.fillOval(360,130,96,120);
        g.fillOval(290,130,96,120);
        
        //Pupila
        g.setColor(Color.black);
        g.fillOval(330,175,40,40);
        g.fillOval(380,175,40,40);        
        //boca
        g.setColor(Color.black);
        g.drawArc(350, 235, 55, 55, 180, 110);        
       
        Graphics2D g2d  = (Graphics2D)g;
        BasicStroke grosor1 = new  BasicStroke(4);
        g2d.setStroke(grosor1);
        

        //alas
        
        // contorno        
        g.setColor(Color.black);
        g.drawOval(205,70,70,115);      
        g.drawOval(239,70,69,110);
        
        Color Gris = new Color(227,225,216);
        g.setColor(Gris);
        //g.fillOval(200,70,70,11);      
        //g.fillOval(205,70,70,115);
        g.fillOval(239,70,69,110);

        //g.setColor(Color.blue);
        //g.fillOval(180,320,200,100);
       
        //lapiz
        //g.setColor(Color.black);
                 //x    y   anc  alt  anch arco  alto arco
        //g.drawArc(120, 320, 100, 100, 90, 180);
        //g.drawLine(150, 50, 60, 100);
        
        
         //int[] X={117, 101, 112, 101,110};
        //int[] Y={15, 15, 16, 15,15};
        
        //g.setColor(Color.black);
        //g.drawPolygon(X,Y,5);
       
        
        //g.fillOval(390,70,90,40);
        //g.fillOval(425,70,100,50);

        //g.fillOval(590,70,100,50);
        //g.fillOval(630,70,90,40);
        //g.fillOval(690,70,100,50);
       
       //ojos
       
       
       //alas
       
       
       
   }
}
