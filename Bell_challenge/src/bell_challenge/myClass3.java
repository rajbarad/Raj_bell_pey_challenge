/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bell_challenge;

/**
 *
 * @author rajbarad
 */
public class myClass3 extends Players{
    public int points = 0;
    public int timesBetray = 0;
    public float betray = 0;
    
    
    public int getPoints()
    {
        return points;
    }
    public float getBetrays()
    {
        return betray;
    }
    public void setPoints(int p)
    {
        points = points + p;
    }
    public void setBetrays(boolean b, int r)
    {
        if(r != 0)
        {
            if(b)
            {
                timesBetray++;
                betray = timesBetray/r;
            }
            else
                betray = timesBetray/r;
        }
        else if(r == 0)
            betray = 0;
    }
    
    public String myClass(int x, int y, int z, int r, float b)
    {
        
        if(r > 7000)
        {
            return "betray";
        }
        else if(x > 7)
            return "betray";
        else if(z <= 4)
            return "cooperate";
        else if(x-y >= 3 && y-z <=2 && x<5 && b<=0.4)
            return "cooperate";
        else if(z-x <= 2)
            return "betray";
        
        return "betray";
                
    }
    
}
