package cn.com.booway.test;

/**
 * @author Administrator
 *
 */
public abstract class Computer
{   // ���������ӿ����ԣ�������ꡣ
    public KeyBoardInterface keyBoard;
    public MouseInterface mouse;

    // ������󷽷��л�ȡcpu,�Կ�,�ڴ��Ʒ�ơ�
    public abstract void getCpu();

    public abstract void getVideoCard();

    public abstract void getMemory();

    public KeyBoardInterface getKeyBoard()
    {
        return keyBoard;
    }

    public void setKeyBoard(KeyBoardInterface keyBoard)
    {
        this.keyBoard = keyBoard;
    }

    public MouseInterface getMouse()
    {
        return mouse;
    }

    public void setMouse(MouseInterface mouse)
    {
        this.mouse = mouse;
    }

}
