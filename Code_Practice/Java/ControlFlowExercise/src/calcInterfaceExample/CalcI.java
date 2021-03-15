package calcInterfaceExample;

@FunctionalInterface
interface CalcI<T>{
    T compute(T a, T b, String op);
}
