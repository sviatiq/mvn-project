import org.junit.Assert;

public class Test {
    @org.junit.Test
    public void testHello(){
        Assert.assertEquals("Hello!", Hello.hello());
    }

    @org.junit.Test
    public void testHelloAge(){
        Assert.assertEquals("Hello, 6!", Hello.helloAge(6));
        Assert.assertEquals("Hello, 20!", Hello.helloAge(20));
        Assert.assertEquals("Hello, 100!", Hello.helloAge(100));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testHelloAgeZero(){
        Hello.helloAge(0);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void testHelloAgeNegative(){
        Hello.helloAge(-10);
    }
}
