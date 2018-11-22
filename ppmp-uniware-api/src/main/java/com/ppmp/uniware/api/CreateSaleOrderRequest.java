package com.ppmp.uniware.api;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import com.ppmp.uniware.base.ServiceRequest;
import com.ppmp.uniware.model.WsInvoice;
import com.ppmp.uniware.model.WsSaleOrder;

/**
 * @author ankurpratik on 21/11/18.
 */
public class CreateSaleOrderRequest extends ServiceRequest {

    private static final long serialVersionUID = 3148768119801793617L;
    @NotNull
    @Valid
    private WsSaleOrder saleOrder;

    @Valid
    private List<WsInvoice>   invoices;

    public void setSaleOrder(WsSaleOrder saleOrder) {
        this.saleOrder = saleOrder;
    }

    public WsSaleOrder getSaleOrder() {
        return saleOrder;
    }

    @Override
    public String toString() {
        return "CreateSaleOrderRequest [saleOrder=" + saleOrder + ",invoices=" + invoices + "]";
    }

    public List<WsInvoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<WsInvoice> invoices) {
        this.invoices = invoices;
    }
}
