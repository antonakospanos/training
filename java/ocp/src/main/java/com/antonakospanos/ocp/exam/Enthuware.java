package com.antonakospanos.ocp.exam;

class Enthuware {

    // Nested classes & interfaces
    interface House {
        default String getAddress() {
            return "101 Main Str";
        }
    }

    interface Office {
        static String getAddress() {
            return "101 Smart Str";
        }
    }

    interface WFH extends House, Office {
    }

    class HomeOffice implements House, Office {
        public String getAddress() {
            return "R No 1, Home";
        }
    }

    class MyInnerClass {
        final private Object val;

        MyInnerClass(Object o) {
            val = o; // permits final val to be initialized
        }
    }

    static class MyStaticClass {
        private Object val;
    }

    // pvsv
    public static void main(String[] args) {
        // Outer Class: Accessible!
        Enthuware enthuware = new Enthuware();
        GoCertify goCertify = new GoCertify();
        GoCertify.InnerClass innerClass = new GoCertify().new InnerClass();
        GoCertify.StaticNestedClass staticNestedClass = new GoCertify.StaticNestedClass();

        // Static Nested class: Accessible!
        MyStaticClass myClass = new MyStaticClass();
        myClass.val = null;

        // Inner Class: NOT Accessible!!!
        // MyInnerClass myInnerClass = new MyInnerClass();
        // Office o = new HomeOffice();

        new Thread(() -> {
        }).run();
    }


    // Methods
    public long test1(int i) {
        return i;
    }

    public int test2(long i) {
        return (int) i;
    }

    public int test2(int i) {
        return (int) i;
    }
}


