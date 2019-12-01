/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bell_challenge;
import java.util.ArrayList;
/**
 *
 * @author rajbarad
 */
public class Bell_challenge {

    public static void game(Players a, Players b, int x, int y, int z, int r)
    {
          String response_a = a.myClass(x,y,z,r,b.getBetrays());
          String response_b = b.myClass(x,y,z,r,a.getBetrays());
              
           if(response_a.equalsIgnoreCase("betray") && response_b.equalsIgnoreCase("betray"))
           {
               a.setPoints(x);
               a.setBetrays(true, r);
               b.setPoints(x);
               b.setBetrays(true, r);

           }
           else if(response_a.equalsIgnoreCase("betray") && response_b.equalsIgnoreCase("cooperate"))
           {
               a.setPoints(x);
               a.setBetrays(true, r);
               b.setPoints(0);
               b.setBetrays(false, r);
           }
           else if(response_a.equalsIgnoreCase("cooperate") && response_b.equalsIgnoreCase("betray"))
           {
               a.setPoints(0);
               a.setBetrays(false, r);
               b.setPoints(x);
               b.setBetrays(true, r);
           }
           else if(response_a.equalsIgnoreCase("cooperate") && response_b.equalsIgnoreCase("cooperate"))
           {
               a.setPoints(y);
               a.setBetrays(false, r);
               b.setPoints(y);
               b.setBetrays(false, r);
           }       
       }  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      
       int g = 1;
       int pointp=0,pointq=0; 
       int x = 0,y=1, z=2,r;
       int a,b;
       int c = 5;
       int d;
       ArrayList<Players> players = new ArrayList<Players>();
       //ArrayList<String> players = new ArrayList<String>();
       Players p1,p2,p3,p4,p5,p6;
       p1 = new myClass();
       p2 = new myClass2();
       p3 = new myClass3();
       p4 = new myClass4();
       p5 = new myClass5();
       p6 = new myClass6();
//       System.out.println(" "+x+" "+y+" "+z);
       
    //for(int qq = 0; qq <= 1000; qq++)
    //{
       for(r = 0; r <=10000;r++)
       { 
           c = 5;
           players.add(p1);
           players.add(p2);
           players.add(p3);
           players.add(p4);
           players.add(p5);
           players.add(p6);
           do
            {
                x = (int)(Math.random()*((10-1)+1))+1;
                y = (int)(Math.random()*((10-1)+1))+1;
                z = (int)(Math.random()*((10-1)+1))+1;
                if(x < y && y < z && x < z)
                {
                    break;
                }   
            }
            while(g>0);
            
           do
            {
                
                a = (int)(Math.random()*((c-0)+1))+0;
                b = (int)(Math.random()*((c-0)+1))+0;
                if(a!=b)
                {
                    if(!(players.isEmpty())) 
                    {
                        players.get(a);
                        players.get(b);
                        game(players.get(a),players.get(b),x,y,z,r);
                        //System.out.println(" "+players.get(a)+" "+players.get(b));
                        players.remove(a);
                        if( b>a && b-1 >= 0)
                            players.remove(b-1);
                        else if(a>b)
                            players.remove(b);
                        c = c-2; 
                    }
                    else
                        break;
                }
            }
            while(!players.isEmpty());
       }
       
       
    //}
     System.out.println("player 1 point: "+ p1.getPoints());
        System.out.println("player 2 point: "+ p2.getPoints());
        System.out.println("player 3 point: "+ p3.getPoints());
        System.out.println("player 4 point: "+ p4.getPoints());
        System.out.println("player 5 point: "+ p5.getPoints());
        System.out.println("player 6 point: "+ p6.getPoints());
    }
    
}
