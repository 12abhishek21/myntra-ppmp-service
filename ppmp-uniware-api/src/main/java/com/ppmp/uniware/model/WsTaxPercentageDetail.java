package com.ppmp.uniware.model;

import javax.validation.constraints.Min;
import java.math.BigDecimal;

/**
 * @author ankurpratik on 21/11/18.
 */
public class WsTaxPercentageDetail {
    private String     taxTypeCode;
    @Min(value = 0)
    private BigDecimal vat               = BigDecimal.ZERO;
    @Min(value = 0)
    private BigDecimal cst               = BigDecimal.ZERO;
    @Min(value = 0)
    private BigDecimal cstFormc          = BigDecimal.ZERO;
    @Min(value = 0)
    private BigDecimal taxPercentage     = BigDecimal.ZERO;
    @Min(value = 0)
    private BigDecimal serviceTax        = BigDecimal.ZERO;
    @Min(value = 0)
    private BigDecimal additionalTax     = BigDecimal.ZERO;
    @Min(value = 0)
    private BigDecimal centralGst        = BigDecimal.ZERO;
    @Min(value = 0)
    private BigDecimal stateGst          = BigDecimal.ZERO;
    @Min(value = 0)
    private BigDecimal unionTerritoryGst = BigDecimal.ZERO;
    @Min(value = 0)
    private BigDecimal integratedGst     = BigDecimal.ZERO;
    @Min(value = 0)
    private BigDecimal compensationCess  = BigDecimal.ZERO;

    public String getTaxTypeCode() {
        return taxTypeCode;
    }

    public void setTaxTypeCode(String taxTypeCode) {
        this.taxTypeCode = taxTypeCode;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    public BigDecimal getCst() {
        return cst;
    }

    public void setCst(BigDecimal cst) {
        this.cst = cst;
    }

    public BigDecimal getCstFormc() {
        return cstFormc;
    }

    public void setCstFormc(BigDecimal cstFormc) {
        this.cstFormc = cstFormc;
    }

    public BigDecimal getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(BigDecimal taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public BigDecimal getServiceTax() {
        return serviceTax;
    }

    public void setServiceTax(BigDecimal serviceTax) {
        this.serviceTax = serviceTax;
    }

    public BigDecimal getAdditionalTax() {
        return additionalTax;
    }

    public void setAdditionalTax(BigDecimal additionalTax) {
        this.additionalTax = additionalTax;
    }

    public BigDecimal getCentralGst() {
        return centralGst;
    }

    public void setCentralGst(BigDecimal centralGst) {
        this.centralGst = centralGst;
    }

    public BigDecimal getStateGst() {
        return stateGst;
    }

    public void setStateGst(BigDecimal stateGst) {
        this.stateGst = stateGst;
    }

    public BigDecimal getUnionTerritoryGst() {
        return unionTerritoryGst;
    }

    public void setUnionTerritoryGst(BigDecimal unionTerritoryGst) {
        this.unionTerritoryGst = unionTerritoryGst;
    }

    public BigDecimal getIntegratedGst() {
        return integratedGst;
    }

    public void setIntegratedGst(BigDecimal integratedGst) {
        this.integratedGst = integratedGst;
    }

    public BigDecimal getCompensationCess() {
        return compensationCess;
    }

    public void setCompensationCess(BigDecimal compensationCess) {
        this.compensationCess = compensationCess;
    }


    @Override
    public String toString() {
        return "WsTaxPercentageDetail{" + "taxTypeCode='" + taxTypeCode + '\'' + ", vat=" + vat + ", cst=" + cst + ", cstFormc=" + cstFormc + ", taxPercentage=" + taxPercentage
                + ", serviceTax=" + serviceTax + ", additionalTax=" + additionalTax + ", centralGst=" + centralGst + ", stateGst=" + stateGst + ", unionTerritoryGst="
                + unionTerritoryGst + ", integratedGst=" + integratedGst + ", compensationCess=" + compensationCess + '}';
    }
}
