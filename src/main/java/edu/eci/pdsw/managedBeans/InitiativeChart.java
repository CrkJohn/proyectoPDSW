package edu.eci.pdsw.managedBeans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;

import edu.eci.pdsw.entities.chartInitiative;
import edu.eci.pdsw.samples.services.InitiativeServices;
import edu.eci.pdsw.samples.services.ServicesException;


@SuppressWarnings("deprecation")
@ManagedBean(name = "chartBean")
@SessionScoped
public class InitiativeChart extends BasePageBean {
	
	@Inject
	InitiativeServices initiativeService;

	private static final long serialVersionUID = 3594009161252782831L;
 
    private BarChartModel barModel;
 
    public void itemSelect(ItemSelectEvent event) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
                "Item Index: " + event.getItemIndex() + ", Series Index:" + event.getSeriesIndex());
 
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
 
 
    public BarChartModel getBarModel() {
    	createBarModel();
        return barModel;
    }
 
    private BarChartModel initBarModel() {
        BarChartModel model = new BarChartModel();
        ChartSeries area= new ChartSeries();
        area.setLabel("Numero de iniciativas");
        List<chartInitiative> c;
		try {
			c = initiativeService.getDataChart();
			for(chartInitiative ci : c) {
	        	area.set(ci.getArea(),ci.getCantidad());
	        }
	        
	        model.addSeries(area);
		} catch (ServicesException e) {
			e.printStackTrace();
		}
        
        
        return model;
    }
 
    private void createBarModel()  {
        barModel = initBarModel();
        barModel.setTitle("Iniciativas por area");
        barModel.setLegendPosition("ne");
 
        Axis xAxis = barModel.getAxis(AxisType.X);
        xAxis.setLabel("Area");
 
        Axis yAxis = barModel.getAxis(AxisType.Y);
        yAxis.setLabel("Cantidad Iniciativas");
        yAxis.setMin(0);
        yAxis.setMax(15);
    }

}