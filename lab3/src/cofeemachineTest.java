import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class cofeemachineTest {
    @Test
    public void test1() {
        cofeemachine c = new cofeemachine();
        assertEquals("turn the machine on", c.addMoney(20));
    }

    @Test
    public void test2() {
        cofeemachine c = new cofeemachine();
        assertEquals("Power on" + "Lights on", c.openMachine());
    }

    @Test
    public void test3() {
        cofeemachine c = new cofeemachine();
        c.power = true;
        assertEquals("Error!", c.openMachine());
    }

    @Test
    public void test4() {
        cofeemachine c = new cofeemachine();
        c.openMachine();
        c.closeMachine();
        assertEquals("turn the machine on", c.addMoney(10));
    }

    @Test
    public void test5() {
        cofeemachine c = new cofeemachine();
        c.openMachine();
        assertEquals("money added Successfully", c.addMoney(20));
    }

    @Test
    public void test6() {
        cofeemachine c = new cofeemachine();
        assertEquals("Power on" + "Lights on", c.openMachine());
        assertEquals("money added Successfully", c.addMoney(15));
    }

    @Test
    public void test7() {
        cofeemachine c = new cofeemachine();
        assertEquals("Power on" + "Lights on", c.openMachine());
        assertEquals("money added Successfully", c.addMoney(15));
        assertEquals("Lights off" + "Power off", c.closeMachine());
    }

    @Test
    public void test8() {
        cofeemachine c = new cofeemachine();
        assertEquals("Please turn the machine on", c.makeCoffee(2));
    }

    @Test
    public void test9() {
        cofeemachine c = new cofeemachine();
        assertEquals("Power on" + "Lights on", c.openMachine());
        assertEquals("money added Successfully", c.addMoney(40));
        assertEquals(2 + " Coffee successfuly made", c.makeCoffee(3));
    }

    @Test
    public void test10() {
        cofeemachine c = new cofeemachine();
        assertEquals("Power on" + "Lights on", c.openMachine());
        assertEquals("money added Successfully", c.addMoney(10));
        assertEquals(2 + " Coffee successfuly made", c.makeCoffee(4));
    }

    @Test
    public void test11() {
        cofeemachine c = new cofeemachine();
        assertEquals("Power on" + "Lights on", c.openMachine());
        assertEquals("money added Successfully", c.addMoney(25));
        assertEquals(1 + " Coffee successfuly made", c.makeCoffee(1));
    }
}