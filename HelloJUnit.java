package junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HelloJUnit {
	private Additionoftwonumbers object1;

	@Before
	public void setup() {
	object1=new Additionoftwonumbers();	
	
	}
    @Test
    public void twoPositiveNumbers()
    {
    	int answer=object1.Additonofnumber(50,50);
    	assertEquals(100,answer);
    }
    @Test
    public void twoNegativeNumbers()
    {
    	int answer=object1.Additonofnumber(-50,-50);
    	assertEquals(-100,answer);
    }
    @Test
    public void oneNegativeNumbers()
    {
    	int answer=object1.Additonofnumber(50,-50);
    	assertEquals(0,answer);
    }
    @Test
    public void zeroAndNegativeNumbers()
    {
    	int answer=object1.Additonofnumber(0,-50);
    	assertEquals(-50,answer);
    }
    @Test
    public void zeroandpositivenumbers()
    {
    	int answer=object1.Additonofnumber(0,50);
    	assertEquals(50,answer);
    }
    
}
