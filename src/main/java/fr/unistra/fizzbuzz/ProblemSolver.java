package fr.unistra.fizzbuzz;

public class ProblemSolver {
    Int2String int2String;
    Displayer displayer;
    public ProblemSolver(){
        int2String=new FizzBuzz();
        displayer=new Displayer() {
            @Override
            public void display(String s) {
                System.out.println(s);
            }
        };
    }
    public ProblemSolver(Displayer displayer, Int2String int2String){
        this.displayer=displayer;
        this.int2String=int2String;
    }
    void solve(int n){
        displayer.display(int2String.convert(n));
    }
}
