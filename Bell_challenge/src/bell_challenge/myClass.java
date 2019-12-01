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
public class myClass extends Players{
    
    public int points = 0;
    public int timesBetray = 0;
    public float betray = 0;
    
    @Override
    public int getPoints()
    {
        return points;
    }
    @Override
    public float getBetrays()
    {
        return betray;
    }

    @Override
    public void setPoints(int p)
    {
        points = points + p;
    }
    @Override
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
    
    public int opponent(int r,float b)
    {
        if(b >= 0.75 && r >= 5000)
            return 5;
        else if(b >= 0.75 && r < 5000)
            return 4;
        else if(b <= 0.5 && r >= 5000)
            return 2;
        else if(b <= 0.5 && r >= 5000)
            return 2;
        
        return 1;
    }
    public int diffrance(int a, int b)
    {
        return a-b;
    }
    @Override
    public String myClass(int x, int y, int z, int r, float b)
    {
        
        if(y-x <= 3 && b >= 0.5 && r > 5000)
            return "betray";
        else if(r == 0)
            return "betray";
        else if(b >= 0.70 && r > 5000)
            return "betray";
        else if(y-x <= 3 && b <= 0.3)
            return "betray";
        else if(y-x >= 3 && b <= 0.4 && r >5000 && y-z <=2 && x <= 5)
            return "cooperate";
        else
            return "cooperate";
     
        
    
    }
    
}
