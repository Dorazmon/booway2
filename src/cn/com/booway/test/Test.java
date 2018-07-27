package cn.com.booway.test;

public class Test
{   

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Computer computer = new Lenovo();
        KeyBoardInterface keyBoard = new DellyouKeyBoard();
        MouseInterface mouse = new RazerMouse();
        computer.setKeyBoard(keyBoard);
        computer.setMouse(mouse);
        System.out.println("---电脑的cup,显卡,内存---");
        computer.getCpu();
        computer.getVideoCard();
        computer.getMemory();
        System.out.println("键盘的品牌：" + computer.getKeyBoard().getKeyBoardBrand());
        System.out.println("键盘的价格：" + computer.getKeyBoard().getKeyBoardPrice() + "元");
        System.out.println("键盘的颜色：" + computer.getKeyBoard().getKeyBoardColor());
        System.out.println("鼠标的品牌：" + computer.getMouse().getMouseBrand());
        System.out.println("鼠标的价格：" + computer.getMouse().getMousePrice() + "元");
        System.out.println("鼠标的颜色：" + computer.getMouse().getMouseColor());
        //测试git

    }

}
