package controller.form.inv;

//<editor-fold defaultstate="collapsed" desc=" import ">
import cococare.framework.swing.CFSwingCtrl;
import model.obj.inv.InvInventory;
//</editor-fold>

public class PnlInventory2ListCtrl extends CFSwingCtrl {

    @Override
    protected Class _getEntity() {
        return InvInventory.class;
    }

    @Override
    protected BaseFunction _getBaseFunction() {
        return BaseFunction.LIST_FUNCTION;
    }
}