import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradeConverterTest {

    private GradeConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new GradeConverter();
    }

    @Test
    public void testConvert1() {
        String expected = "A";
        String actual = converter.convert(  100 );
        assertEquals(expected, actual);
    }
    @Test
    public void testConvert2(){
        String expected = "A";
        String actual = converter.convert( 90) ;
        assertEquals(expected, actual);
    }

    @Test
    public void testConvert3() throws Exception{
        String expeted = "Invalid";
        String actual = converter.convert(-10);
        assertEquals(expeted, actual);

    }

    @Test
    public void testConvert4() throws Exception{
        String expected = "Invalid";
        String actual = converter.convert(101);
        assertEquals(expected, actual);
    }
}