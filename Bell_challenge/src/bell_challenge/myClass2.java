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
public class myClass2 extends Players{
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
    /**
     * From the game description it is evident that the most points can be earned through betraying the opponent thats trying to collaborate, 
     * and collaborating with your opponent has a risk involved, while betraying guarantees at least x points.
     * So I wanted to make sure that collaborating with someone was worth the risk. I decided that it is safest to collaborate under two scenarios,
     * 1. If the y values is more than 8 and the opponents b values is less than or equal to 0.4. the high Y value makes sure that my program is 
     *    rewarded for its collaboration. At the same time I needed to make sure to avoid the opponents whose tendency is to betray, so I am not risking getting 
     *    0 points.   
     * 2. If the z values is less than or equal to 4. this means that the reward for betraying is not very high. In which case I am willing to lose the guaranteed X 
     *    points in order to improve my program's betrayal ratio(b).
     *  
     * Lastly, I have two conditions where my program will always betray and ignore the conditions I have set for cooperating. 
     * 1. If r > 7000. Once the game progresses and is in its final 3000 rounds, I dint not want my program to take any more risks and secure at least X amounts of
     *    points in each round.
     * 2. If x >= 5. Betraying guarantees a prize of X points. So if the value of X is greater than 5 points, I want my program to secure those points by betraying.
     *    
     * 
     * To confirm my hypothesis I decided to test my program by simulating the actual game. I developed 7 other alternative solutions and entered them
     * into my simulator. I simulated the game a total of 1000 times and found that my Program consistently won the most points compered to all the 
     * other alternative programs. 
     * I have included the simulator that I developed in a separate folder under the name "mySimulator", In the folder you will also find a copy of
     * the UML class diagram of my simulator which is included for easier understanding.
     * 
     * @param x
     * @param y
     * @param z
     * @param r
     * @param b
     * @return 
     */
    
    public String myClass(int x, int y, int z, int r, float b)
    {
        if(r > 7500)
            return "betray";
        else if(x >= 5)
            return "betray";
        else if(z <= 4)
            return "cooperate";
        else if(y >= 7 && b <= 0.4)
            return "cooperate";
        
        return "betray";
    }
}
