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
public class myClass5 extends Players{
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
       
        
        return "betray";
    }
    
}
