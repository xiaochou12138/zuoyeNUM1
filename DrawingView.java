package company;

public class DrawingView {

    protected DrawingView(){}

   // public ShapeDlg shapeDlg;

    public void OnDraw() {}

    public boolean PreCreateWindow()

    {
        return true;
    }

    protected boolean OnPreparePrint()

    {
        return true;
    }

    protected void OnBeginPrint(){}

    protected void OnEndPrint(){}

    public void finalizee(){ }
}
