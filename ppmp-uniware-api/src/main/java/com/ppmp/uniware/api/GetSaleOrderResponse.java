package com.ppmp.uniware.api;

import javax.xml.bind.annotation.XmlRootElement;

import com.ppmp.uniware.base.ServiceResponse;
import com.ppmp.uniware.model.SaleOrderDetailDTO;

/**
 * @author ankurpratik on 21/11/18.
 */
@XmlRootElement
public class GetSaleOrderResponse extends ServiceResponse {

    private SaleOrderDetailDTO saleOrderDTO;

    private boolean            isFailedOrderFetch;

    private boolean            isRefreshEnabled;

    public SaleOrderDetailDTO getSaleOrderDTO() {
        return saleOrderDTO;
    }

    public void setSaleOrderDTO(SaleOrderDetailDTO saleOrderDTO) {
        this.saleOrderDTO = saleOrderDTO;
    }

    public boolean isFailedOrderFetch() {
        return isFailedOrderFetch;
    }

    public void setFailedOrderFetch(boolean failedOrderFetch) {
        isFailedOrderFetch = failedOrderFetch;
    }

    public boolean isRefreshEnabled() {
        return isRefreshEnabled;
    }

    public void setRefreshEnabled(boolean refreshEnabled) {
        isRefreshEnabled = refreshEnabled;
    }
}
