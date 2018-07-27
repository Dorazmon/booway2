package cn.com.booway.test;

public class Lenovo extends Computer
{

    @Override
    public void getCpu()
    {
        // TODO Auto-generated method stub
        System.out.println("Intel 酷睿i9 X的CPU");

    }

    @Override
    public void getVideoCard()
    {
        // TODO Auto-generated method stub
        System.out.println("英伟达(NVIDIA)TITANV显卡");

    }

    @Override
    public void getMemory()
    {
        // TODO Auto-generated method stub
        System.out.println("金士顿(Kingston)骇客神条 Fury系列 DDR3 1866 8GB");
    }

}
