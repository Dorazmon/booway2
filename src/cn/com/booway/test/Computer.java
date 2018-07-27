package cn.com.booway.test;

/**
 * @author Administrator
 *
 */
public abstract class Computer
{   // 定义两个接口属性，键盘鼠标。
    public KeyBoardInterface keyBoard;
    public MouseInterface mouse;

    // 定义抽象方法有获取cpu,显卡,内存的品牌。
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
