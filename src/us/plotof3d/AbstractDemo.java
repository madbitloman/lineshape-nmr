package us.plotof3d;

import org.jzy3d.chart.Chart;

public abstract class AbstractDemo implements IDemo{
	@Override
	public String getName() {
		return this.getClass().getSimpleName();
	}
	
	@Override
	public String getPitch(){
		return "";
	}
	
	@Override
	public boolean isInitialized(){
	    return chart!=null;
	}
	
	@Override
	public Chart getChart(){
        return chart;
    }
	
	public String getCanvasType(){
	    return canvasType;
	}
	
	@Override
    public boolean hasOwnChartControllers(){
	    return false;
	}

    protected Chart chart;
    protected String canvasType="awt";
}
