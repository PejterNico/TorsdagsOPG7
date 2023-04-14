package Opg1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TVTest2 {

    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void test() {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.channelUp();
        tv2.channelDown();
        tv2.turnOn();
        tv2.volumeUp();

        Assert.assertEquals(30,tv1.getChannel());
        Assert.assertEquals(1,tv2.getChannel());
        tv2.channelUp();
        Assert.assertEquals(2,tv2.getChannel());
    }
    @Test
    public void volumeUp() {
    }
}