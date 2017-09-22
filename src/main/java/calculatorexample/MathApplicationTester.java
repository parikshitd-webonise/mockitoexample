package calculatorexample;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

    @InjectMocks
    MathApplication mathApplication  = new MathApplication();

    @Mock
    CalculatorService calculatorService;

    @Test
    public void testAdd(){

        when(calculatorService.add(10.0,20.0)).thenReturn(30.00);
        Assert.assertEquals(mathApplication.add(10.0, 20.0),30.0,0);

        when(calculatorService.substract(30.0,20.0)).thenReturn(10.0);
    }
}
