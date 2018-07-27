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
        System.out.println("---���Ե�cup,�Կ�,�ڴ�---");
        computer.getCpu();
        computer.getVideoCard();
        computer.getMemory();
        System.out.println("���̵�Ʒ�ƣ�" + computer.getKeyBoard().getKeyBoardBrand());
        System.out.println("���̵ļ۸�" + computer.getKeyBoard().getKeyBoardPrice() + "Ԫ");
        System.out.println("���̵���ɫ��" + computer.getKeyBoard().getKeyBoardColor());
        System.out.println("����Ʒ�ƣ�" + computer.getMouse().getMouseBrand());
        System.out.println("���ļ۸�" + computer.getMouse().getMousePrice() + "Ԫ");
        System.out.println("������ɫ��" + computer.getMouse().getMouseColor());

    }
}
