package com.ivanxc.netcracker.lab.chapter3;

public interface IntSequence {
    boolean hasNext();
    int next();

    static IntSequence of(int... numbers) {
        return new IntSequence() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < numbers.length;
            }

            @Override
            public int next() {
                return numbers[index++];
            }
        };
    }

    static IntSequence constant(int value) {
        return new IntSequence() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public int next() {
                return value;
            }
        };
    }
}
