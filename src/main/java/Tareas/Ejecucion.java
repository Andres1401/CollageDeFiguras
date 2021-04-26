/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas;
import java.util.Scanner;

/**
 *
 * @author Jesus Andres
 */
public class Ejecucion {
//Circle  [] circulos= new Circle [20];
//Square [] cuadrados= new Square [20];
//Triangle [] triangulos= new Triangle [20];
//Rectangulo [] rectangulos= new Rectangulo [20];

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char op;
        System.out.println("\nBienvenido al programa CollageDeFiguras");
        Circle  [] circulos= new Circle [50];
        Square [] cuadrados= new Square [50];
        Triangle [] triangulos= new Triangle [50];
        Rectangulo [] rectangulos= new Rectangulo [50];
        Trapecio [] trapecios=new Trapecio [50];
        int numero1; 
        int numero2; 
        int numero3; 
        int numero4; 
        int numero5; 
        int numero6; 
        int numero7; 
        int numero8;
        int p=0;
        
        int n1;int n2;int n3;int n4;int n5; int n6; int n7;int n8;
        int n9;int n10;int n11;int n12;int n13; int n14; int n15;int n16;
        int n17;int n18;int n19;int n20;int n21; int n22; int n23;int n24;
        int n25;int n26;int n27;int n28;int n29; int n30; int n31; int n32; int n33;
        int n34; int n35; int n36; int n37;int n38; int n39; int n40;
        int num1; int num2; int num3; int num4; int num5; int num6; int num7; int num8;
        
        for(int i=0;i<10;i=i+1){
        
        numero1= (int)(Math. random()*450+10);
        numero2= (int)(Math. random()*450+10);
        numero3= (int)(Math. random()*450+10);
        numero4= (int)(Math. random()*450+10);
        numero5= (int)(Math. random()*450+10);
        numero6= (int)(Math. random()*450+10);
        numero7= (int)(Math. random()*450+10);
        numero8= (int)(Math. random()*450+10);
        
        num1=(int)(Math. random()*100+10);
        num2=(int)(Math. random()*100+10);
        num3=(int)(Math. random()*100+10);
        num4=(int)(Math. random()*100+10);
        num5=(int)(Math. random()*100+10);
        num6=(int)(Math. random()*100+10);
        num7=(int)(Math. random()*100+10);
        num8=(int)(Math. random()*100+10);
       
        
        circulos[i]= new Circle(num1,numero2,numero2,"blue");
        cuadrados[i]= new Square(num2,numero7,numero1,"red");
        triangulos[i]= new Triangle(num3,num8,numero3,numero4,"green");
        rectangulos[i]= new Rectangulo(num4,num6,numero5,numero5,"black");
        trapecios[i]=new Trapecio(num5,num7,numero4,numero4,"purple");
                
        circulos[i+10]= new Circle(num6,numero5,numero8,"black");
        cuadrados[i+10]= new Square(num7,numero7,numero3,"yellow");
        triangulos[i+10]= new Triangle(num8,num3,numero8,numero4,"magenta");
        rectangulos[i+10]= new Rectangulo(num3,num1,numero3,numero2,"blue");
        trapecios[i+10]=new Trapecio(num7,num2,numero2,numero4,"orange");
        
        circulos[i+20]= new Circle(num1,numero2,numero3,"purple");
        cuadrados[i+20]= new Square(num2,numero4,numero1,"blue");
        triangulos[i+20]= new Triangle(num3,num7,numero2,numero4,"red");
        rectangulos[i+20]= new Rectangulo(num4,num7,numero1,numero5,"green");
        trapecios[i+20]=new Trapecio(num5,numero7,numero2,numero4,"black");
                
        circulos[i+30]= new Circle(num6,numero6,numero8,"orange");
        cuadrados[i+30]= new Square(num7,numero7,numero2,"black");
        triangulos[i+30]= new Triangle(num5,num2,numero8,numero4,"orange");
        rectangulos[i+30]= new Rectangulo(num3,num1,numero3,numero2,"red");
        trapecios[i+30]=new Trapecio(num2,num7,numero8,numero3,"red");
        
        circulos[i+20]= new Circle(num3,numero6,numero3,"magenta");
        cuadrados[i+20]= new Square(num2,numero2,numero6,"magenta");
        triangulos[i+20]= new Triangle(num3,num7,numero2,numero3,"yellow");
        rectangulos[i+20]= new Rectangulo(num4,num6,numero4,numero5,"magenta");
        trapecios[i+20]=new Trapecio(num5,numero7,numero2,numero2,"blue");
                
        circulos[i+30]= new Circle(num6,numero5,numero7,"red");
        cuadrados[i+30]= new Square(num7,numero7,numero3,"green");
        triangulos[i+30]= new Triangle(num5,num2,numero2,numero4,"blue");
        rectangulos[i+30]= new Rectangulo(num3,num1,numero2,numero3,"orange");
        trapecios[i+30]=new Trapecio(num2,num7,numero2,numero1,"green");
       
        }
        n1 = (int)(Math. random()*40+0);
        n2=(int)(Math. random()*40+0);
        n3=(int)(Math. random()*40+0);
        n4=(int)(Math. random()*40+0);
        n5=(int)(Math. random()*40+0);
        n6=(int)(Math. random()*40+0);
        n7=(int)(Math. random()*40+0);
        n8=(int)(Math. random()*40+0);
        n9=(int)(Math. random()*40+0);
        n10=(int)(Math. random()*40+0);
        n11=(int)(Math. random()*40+0);
        n12=(int)(Math. random()*40+0);
        n13=(int)(Math. random()*40+0);
        n14=(int)(Math. random()*40+0);
        n15=(int)(Math. random()*40+0);
        n16=(int)(Math. random()*40+0);
        n17=(int)(Math. random()*40+0);
        n18=(int)(Math. random()*40+0);
        n19=(int)(Math. random()*40+0);
        n20=(int)(Math. random()*40+0);
        n21=(int)(Math. random()*40+0);
        n22=(int)(Math. random()*40+0);
        n23=(int)(Math. random()*40+0);
        n24=(int)(Math. random()*40+0);
        n25=(int)(Math. random()*40+0);
        n26=(int)(Math. random()*40+0);
        n27=(int)(Math. random()*40+0);
        n28=(int)(Math. random()*40+0);
        n29=(int)(Math. random()*40+0);
        n30=(int)(Math. random()*40+0);
        n31=(int)(Math. random()*40+0);
        n32=(int)(Math. random()*40+0);
        n33=(int)(Math. random()*40+0);
        n34=(int)(Math. random()*40+0);
        n35=(int)(Math. random()*40+0);
        n36=(int)(Math. random()*40+0);
        n37=(int)(Math. random()*40+0);
        n38=(int)(Math. random()*40+0);
        n39=(int)(Math. random()*40+0);
        n40=(int)(Math. random()*40+0);
        
         Scanner sc = new Scanner(System.in);
        do{
        
        System.out.println("\nA (Avanzar)\nR (Retroceder)\nTodas las figuras" +
                           "\nSólo los círculos" +
                           "\nSólo los triángulos" +
                           "\nSólo los cuadrados" +
                           "\nSólo los rectángulos" +
                           "\nSólo trapecios"+
                           "\n\nM (morado)"+
                           "\nN (naranja)"+
                           "\nG (reGenerar)"+
                           "\nF (fin)");
        
        op = sc.next().charAt(0);
                          
        
        switch (op){
                case 'A': {switch (p){
                    case 0: 
                            circulos[n1].draw();
                            rectangulos[n2].draw();
                            cuadrados[n3].draw();
                            triangulos[n4].draw();
                            trapecios[n5].draw();
                            
                            circulos[n6].draw();
                            rectangulos[n7].draw();
                            cuadrados[n8].draw();
                            triangulos[n9].draw();
                            trapecios[n10].draw();
                            
                            circulos[n11].draw();
                            rectangulos[n12].draw();
                            cuadrados[n13].draw();
                            triangulos[n14].draw();
                            trapecios[n15].draw();
                            
                            circulos[n16].draw();
                            rectangulos[n17].draw();
                            cuadrados[n18].draw();
                            triangulos[n19].draw();
                            trapecios[n20].draw();
                            
                            
                            circulos[n21].erase();
                            rectangulos[n22].erase();
                            cuadrados[n23].erase();
                            triangulos[n24].erase();
                            trapecios[n25].erase();
                            
                            circulos[n26].erase();
                            rectangulos[n27].erase();
                            cuadrados[n28].erase();
                            triangulos[n29].erase();
                            trapecios[n30].erase();
                            
                            circulos[n31].erase();
                            rectangulos[n32].erase();
                            cuadrados[n33].erase();
                            triangulos[n34].erase();
                            trapecios[n35].erase();
                            
                            circulos[n36].erase();
                            rectangulos[n37].erase();
                            cuadrados[n38].erase();
                            triangulos[n39].erase();
                            trapecios[n40].erase();
                            
                            p++;
                            break;
                    case 1: 
                           
                            rectangulos[n2].erase();
                            cuadrados[n3].erase();
                            triangulos[n4].erase();
                            trapecios[n5].erase();
                            
                           
                            rectangulos[n7].erase();
                            cuadrados[n8].erase();
                            triangulos[n9].erase();
                            trapecios[n10].erase();
                            
                           
                            rectangulos[n12].erase();
                            cuadrados[n13].erase();
                            triangulos[n14].erase();
                            trapecios[n15].erase();
                            
                           
                            rectangulos[n17].erase();
                            cuadrados[n18].erase();
                            triangulos[n19].erase();
                            trapecios[n20].erase();
                            
                            p++;
                            break;
                    case 2: circulos[n1].erase();
                            triangulos[n4].draw();

                            circulos[n6].erase();
                            triangulos[n9].draw();

                            circulos[n11].erase();
                            triangulos[n14].draw();

                            circulos[n16].erase();
                            triangulos[n19].draw();
                            
                            p++;
                            break;
                    case 3: 

                            cuadrados[n3].draw();
                            triangulos[n4].erase();

                            cuadrados[n8].draw();
                            triangulos[n9].erase();

                            cuadrados[n13].draw();
                            triangulos[n14].erase();

                            cuadrados[n18].draw();
                            triangulos[n19].erase();
                            
                            p++;
                            break;
                    case 4: 
                            rectangulos[n2].draw();
                            cuadrados[n3].erase();
                          
                            rectangulos[n7].draw();
                            cuadrados[n8].erase();
                            
                            rectangulos[n12].draw();
                            cuadrados[n13].erase();
                            
                            rectangulos[n17].draw();
                            cuadrados[n18].erase();
                            
                            p++;
                            break;
                    case 5: 
                            rectangulos[n2].erase();
                            trapecios[n5].draw();

                            rectangulos[n7].erase();
                            trapecios[n10].draw();

                            rectangulos[n12].erase();
                            trapecios[n15].draw();
                            
                            rectangulos[n17].erase();
                            trapecios[n20].draw();
                            
                            break;}}
                            break;
                
                case 'R':{
                    switch (p){
                    case 0: circulos[n1].erase();
                            rectangulos[n2].erase();
                            cuadrados[n3].erase();
                            triangulos[n4].erase();
                            trapecios[n5].erase();
                            
                            circulos[n6].erase();
                            rectangulos[n7].erase();
                            cuadrados[n8].erase();
                            triangulos[n9].erase();
                            trapecios[n10].erase();
                            
                            circulos[n11].erase();
                            rectangulos[n12].erase();
                            cuadrados[n13].erase();
                            triangulos[n14].erase();
                            trapecios[n15].erase();
                            
                            circulos[n16].erase();
                            rectangulos[n17].erase();
                            cuadrados[n18].erase();
                            triangulos[n19].erase();
                            trapecios[n20].erase();
                            
                            circulos[n21].erase();
                            rectangulos[n22].erase();
                            cuadrados[n23].erase();
                            triangulos[n24].erase();
                            trapecios[n25].erase();
                            
                            circulos[n26].erase();
                            rectangulos[n27].erase();
                            cuadrados[n28].erase();
                            triangulos[n29].erase();
                            trapecios[n30].erase();
                            
                            circulos[n31].erase();
                            rectangulos[n32].erase();
                            cuadrados[n33].erase();
                            triangulos[n34].erase();
                            trapecios[n35].erase();
                            
                            circulos[n36].erase();
                            rectangulos[n37].erase();
                            cuadrados[n38].erase();
                            triangulos[n39].erase();
                            trapecios[n40].erase();
                            p--;
                            break;
                    case 1: circulos[n1].draw();
                            rectangulos[n2].draw();
                            cuadrados[n3].draw();
                            triangulos[n4].draw();
                            trapecios[n5].draw();
                            
                            circulos[n6].draw();
                            rectangulos[n7].draw();
                            cuadrados[n8].draw();
                            triangulos[n9].draw();
                            trapecios[n10].draw();
                            
                            circulos[n11].draw();
                            rectangulos[n12].draw();
                            cuadrados[n13].draw();
                            triangulos[n14].draw();
                            trapecios[n15].draw();
                            
                            circulos[n16].draw();
                            rectangulos[n17].draw();
                            cuadrados[n18].draw();
                            triangulos[n19].draw();
                            trapecios[n20].draw();
                            
                            
                            circulos[n21].erase();
                            rectangulos[n22].erase();
                            cuadrados[n23].erase();
                            triangulos[n24].erase();
                            trapecios[n25].erase();
                            
                            circulos[n26].erase();
                            rectangulos[n27].erase();
                            cuadrados[n28].erase();
                            triangulos[n29].erase();
                            trapecios[n30].erase();
                            
                            circulos[n31].erase();
                            rectangulos[n32].erase();
                            cuadrados[n33].erase();
                            triangulos[n34].erase();
                            trapecios[n35].erase();
                            
                            circulos[n36].erase();
                            rectangulos[n37].erase();
                            cuadrados[n38].erase();
                            triangulos[n39].erase();
                            trapecios[n40].erase();
                            
                            p--;
                            break;
                    case 2: circulos[n1].draw();
                            triangulos[n4].erase();

                            circulos[n6].draw();
                            triangulos[n9].erase();

                            circulos[n11].draw();
                            triangulos[n14].erase();

                            circulos[n16].draw();
                            triangulos[n19].erase();
                            circulos[n21].erase();
                            rectangulos[n22].erase();
                            cuadrados[n23].erase();
                            triangulos[n24].erase();
                            trapecios[n25].erase();
                            
                            circulos[n26].erase();
                            rectangulos[n27].erase();
                            cuadrados[n28].erase();
                            triangulos[n29].erase();
                            trapecios[n30].erase();
                            
                            circulos[n31].erase();
                            rectangulos[n32].erase();
                            cuadrados[n33].erase();
                            triangulos[n34].erase();
                            trapecios[n35].erase();
                            
                            circulos[n36].erase();
                            rectangulos[n37].erase();
                            cuadrados[n38].erase();
                            triangulos[n39].erase();
                            trapecios[n40].erase();
                            p--;
                            break;
                    case 3: 
                            cuadrados[n3].erase();
                            triangulos[n4].draw();

                            cuadrados[n8].erase();
                            triangulos[n9].draw();

                            cuadrados[n13].erase();
                            triangulos[n14].draw();

                            cuadrados[n18].erase();
                            triangulos[n19].draw();
                            circulos[n21].erase();
                            rectangulos[n22].erase();
                            cuadrados[n23].erase();
                            triangulos[n24].erase();
                            trapecios[n25].erase();
                            
                            circulos[n26].erase();
                            rectangulos[n27].erase();
                            cuadrados[n28].erase();
                            triangulos[n29].erase();
                            trapecios[n30].erase();
                            
                            circulos[n31].erase();
                            rectangulos[n32].erase();
                            cuadrados[n33].erase();
                            triangulos[n34].erase();
                            trapecios[n35].erase();
                            
                            circulos[n36].erase();
                            rectangulos[n37].erase();
                            cuadrados[n38].erase();
                            triangulos[n39].erase();
                            trapecios[n40].erase();
                            p--;
                            break;
                    case 4: rectangulos[n2].erase();
                            cuadrados[n3].draw();
                          
                            rectangulos[n7].erase();
                            cuadrados[n8].draw();
                            
                            rectangulos[n12].erase();
                            cuadrados[n13].draw();
                            
                            rectangulos[n17].erase();
                            cuadrados[n18].draw();
                            circulos[n21].erase();
                            rectangulos[n22].erase();
                            cuadrados[n23].erase();
                            triangulos[n24].erase();
                            trapecios[n25].erase();
                            
                            circulos[n26].erase();
                            rectangulos[n27].erase();
                            cuadrados[n28].erase();
                            triangulos[n29].erase();
                            trapecios[n30].erase();
                            
                            circulos[n31].erase();
                            rectangulos[n32].erase();
                            cuadrados[n33].erase();
                            triangulos[n34].erase();
                            trapecios[n35].erase();
                            
                            circulos[n36].erase();
                            rectangulos[n37].erase();
                            cuadrados[n38].erase();
                            triangulos[n39].erase();
                            trapecios[n40].erase();
                            
                            p--;
                            break;
                    case 5: rectangulos[n2].draw();
                            trapecios[n5].erase();

                            rectangulos[n7].draw();
                            trapecios[n10].erase();

                            rectangulos[n12].draw();
                            trapecios[n15].erase();
                            
                            rectangulos[n17].draw();
                            trapecios[n20].erase();
                            circulos[n21].erase();
                            rectangulos[n22].erase();
                            cuadrados[n23].erase();
                            triangulos[n24].erase();
                            trapecios[n25].erase();
                            
                            circulos[n26].erase();
                            rectangulos[n27].erase();
                            cuadrados[n28].erase();
                            triangulos[n29].erase();
                            trapecios[n30].erase();
                            
                            circulos[n31].erase();
                            rectangulos[n32].erase();
                            cuadrados[n33].erase();
                            triangulos[n34].erase();
                            trapecios[n35].erase();
                            
                            circulos[n36].erase();
                            rectangulos[n37].erase();
                            cuadrados[n38].erase();
                            triangulos[n39].erase();
                            trapecios[n40].erase();
                            p--;
                            break;}}
                            break;
                    
                    
                case 'M' :  circulos[n1].changeColor("purple");
                            rectangulos[n2].changeColor("purple");
                            cuadrados[n3].changeColor("purple");
                            triangulos[n4].changeColor("purple");
                            trapecios[n5].changeColor("purple");
                            
                            circulos[n6].changeColor("purple");
                            rectangulos[n7].changeColor("purple");
                            cuadrados[n8].changeColor("purple");
                            triangulos[n9].changeColor("purple");
                            trapecios[n10].changeColor("purple");
                            
                            circulos[n11].changeColor("purple");
                            rectangulos[n12].changeColor("purple");
                            cuadrados[n13].changeColor("purple");
                            triangulos[n14].changeColor("purple");
                            trapecios[n15].changeColor("purple");
                            
                            circulos[n16].changeColor("purple");
                            rectangulos[n17].changeColor("purple");
                            cuadrados[n18].changeColor("purple");
                            triangulos[n19].changeColor("purple");
                            trapecios[n20].changeColor("purple");
                            
                            circulos[n21].erase();
                            rectangulos[n22].erase();
                            cuadrados[n23].erase();
                            triangulos[n24].erase();
                            trapecios[n25].erase();
                            
                            circulos[n26].erase();
                            rectangulos[n27].erase();
                            cuadrados[n28].erase();
                            triangulos[n29].erase();
                            trapecios[n30].erase();
                            
                            circulos[n31].erase();
                            rectangulos[n32].erase();
                            cuadrados[n33].erase();
                            triangulos[n34].erase();
                            trapecios[n35].erase();
                            
                            circulos[n36].erase();
                            rectangulos[n37].erase();
                            cuadrados[n38].erase();
                            triangulos[n39].erase();
                            trapecios[n40].erase();
                            break;
                case 'N':  
                            circulos[n1].changeColor("orange");
                            rectangulos[n2].changeColor("orange");
                            cuadrados[n3].changeColor("orange");
                            triangulos[n4].changeColor("orange");
                            trapecios[n5].changeColor("orange");
                            
                            circulos[n6].changeColor("orange");
                            rectangulos[n7].changeColor("orange");
                            cuadrados[n8].changeColor("orange");
                            triangulos[n9].changeColor("orange");
                            trapecios[n10].changeColor("orange");
                            
                            circulos[n11].changeColor("orange");
                            rectangulos[n12].changeColor("orange");
                            cuadrados[n13].changeColor("orange");
                            triangulos[n14].changeColor("orange");
                            trapecios[n15].changeColor("orange");
                            
                            circulos[n16].changeColor("orange");
                            rectangulos[n17].changeColor("orange");
                            cuadrados[n18].changeColor("orange");
                            triangulos[n19].changeColor("orange");
                            trapecios[n20].changeColor("orange");
                            
                            circulos[n21].erase();
                            rectangulos[n22].erase();
                            cuadrados[n23].erase();
                            triangulos[n24].erase();
                            trapecios[n25].erase();
                            
                            circulos[n26].erase();
                            rectangulos[n27].erase();
                            cuadrados[n28].erase();
                            triangulos[n29].erase();
                            trapecios[n30].erase();
                            
                            circulos[n31].erase();
                            rectangulos[n32].erase();
                            cuadrados[n33].erase();
                            triangulos[n34].erase();
                            trapecios[n35].erase();
                            
                            circulos[n36].erase();
                            rectangulos[n37].erase();
                            cuadrados[n38].erase();
                            triangulos[n39].erase();
                            trapecios[n40].erase();
                            break;
                case 'G':   
                            circulos[n1].erase();
                            rectangulos[n2].erase();
                            cuadrados[n3].erase();
                            triangulos[n4].erase();
                            trapecios[n5].erase();
                            
                            circulos[n6].erase();
                            rectangulos[n7].erase();
                            cuadrados[n8].erase();
                            triangulos[n9].erase();
                            trapecios[n10].erase();
                            
                            circulos[n11].erase();
                            rectangulos[n12].erase();
                            cuadrados[n13].erase();
                            triangulos[n14].erase();
                            trapecios[n15].erase();
                            
                            circulos[n16].erase();
                            rectangulos[n17].erase();
                            cuadrados[n18].erase();
                            triangulos[n19].erase();
                            trapecios[n20].erase();
                            
                            
                            circulos[n21].draw();
                            rectangulos[n22].draw();
                            cuadrados[n23].draw();
                            triangulos[n24].draw();
                            trapecios[n25].draw();
                            
                            circulos[n26].draw();
                            rectangulos[n27].draw();
                            cuadrados[n28].draw();
                            triangulos[n29].draw();
                            trapecios[n30].draw();
                            
                            circulos[n31].draw();
                            rectangulos[n32].draw();
                            cuadrados[n33].draw();
                            triangulos[n34].draw();
                            trapecios[n35].draw();
                            
                            circulos[n36].draw();
                            rectangulos[n37].draw();
                            cuadrados[n38].draw();
                            triangulos[n39].draw();
                            trapecios[n40].draw();
                            
                            break;
                case 'F': System.out.println("\nEligio salir el programa");
        }       }                 
    while(op!='F');
    
    
}
}