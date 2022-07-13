package com.jx.packge.Enum;

import sun.java2d.pipe.SpanIterator;

public enum Result {

    TEST{
        @Override
        public void sout(String mess) {
            System.out.println(mess);
        }
    },

    DEV{
        @Override
        public void sout(String mess) {
            System.out.println(mess);
            System.out.println(mess);
            System.out.println(mess);
        }
    };



    public abstract void sout(String mess);
}
