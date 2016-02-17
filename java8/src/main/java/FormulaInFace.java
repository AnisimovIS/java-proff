public interface FormulaInFace {
    double calculate(int i);
    default double sqrt(int i){
        return Math.sqrt(i*100);
    }
}
