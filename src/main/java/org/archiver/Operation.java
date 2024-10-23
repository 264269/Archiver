package org.archiver;

public enum Operation {
    CREATE,
    ADD,
    REMOVE,
    EXTRACT,
    CONTENT,
    EXIT;

    public static Operation getOperation(int value) {
        for (Operation op : Operation.values()) {
            if (op.ordinal() == value) return op;
        }
        throw new IllegalArgumentException("No such operation");
    }
}
