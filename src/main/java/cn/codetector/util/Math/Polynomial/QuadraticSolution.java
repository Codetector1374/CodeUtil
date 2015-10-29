package cn.codetector.util.Math.Polynomial;

import cn.codetector.util.Math.Number.*;
import cn.codetector.util.Math.Number.Number;
import sun.java2d.pipe.SolidTextRenderer;

public class QuadraticSolution {
    Quadratic.Type type;
    Number solution1;
    Number solution2;
    public QuadraticSolution(Quadratic.Type type, Number solution1, Number solution2){
        this.type = type;
        this.solution1 = solution1;
        this.solution2 = solution2;
    }

    public QuadraticSolution(Quadratic.Type type, Number solution1) {
        this.type = type;
        this.solution1 = solution1;
    }

    public Quadratic.Type getSolutionType(){
        return this.type;
    }

    public enum SolutionID{
        Solution_1(1),Solution_2(2);

        private final int value;
        SolutionID(int value){this.value = value;}
        public int getValue(){
            return value;
        }
    }

    public Number getSolution(int SolutionID){
        if (SolutionID == 1){
            return this.solution1;
        }else if (SolutionID == 2){
            return this.solution2;
        }
        return null;
    }

    @Override
    public String toString() {
        if (this.type == Quadratic.Type.OneRealRoot){
            return "Solution: \n"+ this.solution1.toString();
        }else{
            return "Solutions: \n"+ this.solution1.toString()+"\n"+this.solution2.toString();
        }
    }
}
