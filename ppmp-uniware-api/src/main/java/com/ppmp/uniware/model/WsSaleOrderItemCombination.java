package com.ppmp.uniware.model;

import javax.validation.constraints.NotBlank;

/**
 * @author ankurpratik on 21/11/18.
 */
public class WsSaleOrderItemCombination {
    public WsSaleOrderItemCombination() {
    }

    public WsSaleOrderItemCombination(String combinationIdentifier, String combinationDescription) {
        this.combinationIdentifier = combinationIdentifier;
        this.combinationDescription = combinationDescription;
    }

    @NotBlank
    private String combinationIdentifier;

    @NotBlank
    private String combinationDescription;

    /**
     * @return the combinationIdentifier
     */
    public String getCombinationIdentifier() {
        return combinationIdentifier;
    }

    /**
     * @param combinationIdentifier the combinationIdentifier to set
     */
    public void setCombinationIdentifier(String combinationIdentifier) {
        this.combinationIdentifier = combinationIdentifier;
    }

    /**
     * @return the combinationDescription
     */
    public String getCombinationDescription() {
        return combinationDescription;
    }

    /**
     * @param combinationDescription the combinationDescription to set
     */
    public void setCombinationDescription(String combinationDescription) {
        this.combinationDescription = combinationDescription;
    }
}
