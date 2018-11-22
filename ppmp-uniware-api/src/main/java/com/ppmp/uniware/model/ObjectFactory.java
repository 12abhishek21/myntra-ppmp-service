
package com.ppmp.uniware.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateSaleOrderResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "CreateSaleOrderResponse");
    private final static QName _CancelSaleOrderResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "CancelSaleOrderResponse");
    private final static QName _HoldSaleOrderResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "HoldSaleOrderResponse");
    private final static QName _UnholdSaleOrderResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "UnholdSaleOrderResponse");
    private final static QName _HoldSaleOrderItemsResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "HoldSaleOrderItemsResponse");
    private final static QName _UnholdSaleOrderItemsResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "UnholdSaleOrderItemsResponse");
    private final static QName _CreateItemTypeRequest_QNAME = new QName("http://uniware.unicommerce.com/services/", "CreateItemTypeRequest");
    private final static QName _EditItemTypeRequest_QNAME = new QName("http://uniware.unicommerce.com/services/", "EditItemTypeRequest");
    private final static QName _CreateOrEditItemTypeRequest_QNAME = new QName("http://uniware.unicommerce.com/services/", "CreateOrEditItemTypeRequest");
    private final static QName _CreateItemTypeResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "CreateItemTypeResponse");
    private final static QName _EditItemTypeResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "EditItemTypeResponse");
    private final static QName _CreateOrEditItemTypeResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "CreateOrEditItemTypeResponse");
    private final static QName _CreateOrEditFacilityItemTypeResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "CreateOrEditFacilityItemTypeResponse");
    private final static QName _CreateOrEditCategoryResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "CreateOrEditCategoryResponse");
    private final static QName _CreateVendorItemTypeRequest_QNAME = new QName("http://uniware.unicommerce.com/services/", "CreateVendorItemTypeRequest");
    private final static QName _CreateVendorItemTypeResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "CreateVendorItemTypeResponse");
    private final static QName _CreateOrEditVendorItemTypeRequest_QNAME = new QName("http://uniware.unicommerce.com/services/", "CreateOrEditVendorItemTypeRequest");
    private final static QName _CreateOrEditVendorItemTypeResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "CreateOrEditVendorItemTypeResponse");
    private final static QName _EditSaleOrderAddressResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "EditSaleOrderAddressResponse");
    private final static QName _InventoryAdjustmentResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "InventoryAdjustmentResponse");
    private final static QName _AddOrEditPurchaseOrderItemsResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "AddOrEditPurchaseOrderItemsResponse");
    private final static QName _CreateSaleOrderItemAlternateResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "CreateSaleOrderItemAlternateResponse");
    private final static QName _AcceptSaleOrderItemAlternateResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "AcceptSaleOrderItemAlternateResponse");
    private final static QName _EditSaleOrderMetadataResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "EditSaleOrderMetadataResponse");
    private final static QName _CreateCustomerResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "CreateCustomerResponse");
    private final static QName _EditCustomerResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "EditCustomerResponse");
    private final static QName _UpdateTrackingStatusResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "UpdateTrackingStatusResponse");
    private final static QName _ClosePurchaseOrderResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "ClosePurchaseOrderResponse");
    private final static QName _EditVendorItemTypeRequest_QNAME = new QName("http://uniware.unicommerce.com/services/", "EditVendorItemTypeRequest");
    private final static QName _EditVendorItemTypeResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "EditVendorItemTypeResponse");
    private final static QName _EditSaleOrderItemMetadataResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "EditSaleOrderItemMetadataResponse");
    private final static QName _EditScriptConfigResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "EditScriptConfigResponse");
    private final static QName _CreateVendorResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "CreateVendorResponse");
    private final static QName _EditVendorResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "EditVendorResponse");
    private final static QName _AddOrEditItemLabelsResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "AddOrEditItemLabelsResponse");
    private final static QName _VerifySaleOrderResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "VerifySaleOrderResponse");
    private final static QName _MarkItemDamagedOutboundQCResponse_QNAME = new QName("http://uniware.unicommerce.com/services/", "MarkItemDamagedOutboundQCResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.unicommerce.uniware.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateExportJobRequest }
     * 
     */
    public CreateExportJobRequest createCreateExportJobRequest() {
        return new CreateExportJobRequest();
    }

    /**
     * Create an instance of {@link CreateExportJobResponse }
     * 
     */
    public CreateExportJobResponse createCreateExportJobResponse() {
        return new CreateExportJobResponse();
    }

    /**
     * Create an instance of {@link GetExportJobStatusResponse }
     * 
     */
    public GetExportJobStatusResponse createGetExportJobStatusResponse() {
        return new GetExportJobStatusResponse();
    }

    /**
     * Create an instance of {@link CancelSaleOrderRequest }
     * 
     */
    public CancelSaleOrderRequest createCancelSaleOrderRequest() {
        return new CancelSaleOrderRequest();
    }

    /**
     * Create an instance of {@link HoldSaleOrderRequest }
     * 
     */
    public HoldSaleOrderRequest createHoldSaleOrderRequest() {
        return new HoldSaleOrderRequest();
    }

    /**
     * Create an instance of {@link UnholdSaleOrderRequest }
     * 
     */
    public UnholdSaleOrderRequest createUnholdSaleOrderRequest() {
        return new UnholdSaleOrderRequest();
    }

    /**
     * Create an instance of {@link HoldSaleOrderItemsRequest }
     * 
     */
    public HoldSaleOrderItemsRequest createHoldSaleOrderItemsRequest() {
        return new HoldSaleOrderItemsRequest();
    }

    /**
     * Create an instance of {@link UnholdSaleOrderItemsRequest }
     * 
     */
    public UnholdSaleOrderItemsRequest createUnholdSaleOrderItemsRequest() {
        return new UnholdSaleOrderItemsRequest();
    }

    /**
     * Create an instance of {@link GetSaleOrderRequest }
     * 
     */
    public GetSaleOrderRequest createGetSaleOrderRequest() {
        return new GetSaleOrderRequest();
    }

    /**
     * Create an instance of {@link GetSaleOrderResponse }
     * 
     */
    public GetSaleOrderResponse createGetSaleOrderResponse() {
        return new GetSaleOrderResponse();
    }

    /**
     * Create an instance of {@link CreateOrEditFacilityItemTypeRequest }
     * 
     */
    public CreateOrEditFacilityItemTypeRequest createCreateOrEditFacilityItemTypeRequest() {
        return new CreateOrEditFacilityItemTypeRequest();
    }

    /**
     * Create an instance of {@link SearchSaleOrderResponse }
     * 
     */
    public SearchSaleOrderResponse createSearchSaleOrderResponse() {
        return new SearchSaleOrderResponse();
    }

    /**
     * Create an instance of {@link SearchSaleOrderRequest }
     * 
     */
    public SearchSaleOrderRequest createSearchSaleOrderRequest() {
        return new SearchSaleOrderRequest();
    }

    /**
     * Create an instance of {@link GetInventorySnapshotRequest }
     * 
     */
    public GetInventorySnapshotRequest createGetInventorySnapshotRequest() {
        return new GetInventorySnapshotRequest();
    }

    /**
     * Create an instance of {@link GetInventorySnapshotResponse }
     * 
     */
    public GetInventorySnapshotResponse createGetInventorySnapshotResponse() {
        return new GetInventorySnapshotResponse();
    }

    /**
     * Create an instance of {@link CreatePurchaseOrderResponse }
     * 
     */
    public CreatePurchaseOrderResponse createCreatePurchaseOrderResponse() {
        return new CreatePurchaseOrderResponse();
    }

    /**
     * Create an instance of {@link AddOrEditPurchaseOrderItemsRequest }
     * 
     */
    public AddOrEditPurchaseOrderItemsRequest createAddOrEditPurchaseOrderItemsRequest() {
        return new AddOrEditPurchaseOrderItemsRequest();
    }

    /**
     * Create an instance of {@link CreateApprovedPurchaseOrderRequest }
     * 
     */
    public CreateApprovedPurchaseOrderRequest createCreateApprovedPurchaseOrderRequest() {
        return new CreateApprovedPurchaseOrderRequest();
    }

    /**
     * Create an instance of {@link CreateApprovedPurchaseOrderResponse }
     * 
     */
    public CreateApprovedPurchaseOrderResponse createCreateApprovedPurchaseOrderResponse() {
        return new CreateApprovedPurchaseOrderResponse();
    }

    /**
     * Create an instance of {@link CreateSaleOrderItemAlternateRequest }
     * 
     */
    public CreateSaleOrderItemAlternateRequest createCreateSaleOrderItemAlternateRequest() {
        return new CreateSaleOrderItemAlternateRequest();
    }

    /**
     * Create an instance of {@link AcceptSaleOrderItemAlternateRequest }
     * 
     */
    public AcceptSaleOrderItemAlternateRequest createAcceptSaleOrderItemAlternateRequest() {
        return new AcceptSaleOrderItemAlternateRequest();
    }

    /**
     * Create an instance of {@link GetShippingManifestResponse }
     * 
     */
    public GetShippingManifestResponse createGetShippingManifestResponse() {
        return new GetShippingManifestResponse();
    }

    /**
     * Create an instance of {@link SearchItemTypesRequest }
     * 
     */
    public SearchItemTypesRequest createSearchItemTypesRequest() {
        return new SearchItemTypesRequest();
    }

    /**
     * Create an instance of {@link SearchItemTypesResponse }
     * 
     */
    public SearchItemTypesResponse createSearchItemTypesResponse() {
        return new SearchItemTypesResponse();
    }

    /**
     * Create an instance of {@link GetItemTypeDetailResponse }
     * 
     */
    public GetItemTypeDetailResponse createGetItemTypeDetailResponse() {
        return new GetItemTypeDetailResponse();
    }

    /**
     * Create an instance of {@link CreateReversePickupRequest }
     * 
     */
    public CreateReversePickupRequest createCreateReversePickupRequest() {
        return new CreateReversePickupRequest();
    }

    /**
     * Create an instance of {@link CreateReversePickupResponse }
     * 
     */
    public CreateReversePickupResponse createCreateReversePickupResponse() {
        return new CreateReversePickupResponse();
    }

    /**
     * Create an instance of {@link GetBackOrderItemsRequest }
     * 
     */
    public GetBackOrderItemsRequest createGetBackOrderItemsRequest() {
        return new GetBackOrderItemsRequest();
    }

    /**
     * Create an instance of {@link GetBackOrderItemsResponse }
     * 
     */
    public GetBackOrderItemsResponse createGetBackOrderItemsResponse() {
        return new GetBackOrderItemsResponse();
    }

    /**
     * Create an instance of {@link ReleaseShelfResponse }
     * 
     */
    public ReleaseShelfResponse createReleaseShelfResponse() {
        return new ReleaseShelfResponse();
    }

    /**
     * Create an instance of {@link GetItemDetailResponse }
     * 
     */
    public GetItemDetailResponse createGetItemDetailResponse() {
        return new GetItemDetailResponse();
    }

    /**
     * Create an instance of {@link GetPurchaseOrdersRequest }
     * 
     */
    public GetPurchaseOrdersRequest createGetPurchaseOrdersRequest() {
        return new GetPurchaseOrdersRequest();
    }

    /**
     * Create an instance of {@link GetPurchaseOrdersResponse }
     * 
     */
    public GetPurchaseOrdersResponse createGetPurchaseOrdersResponse() {
        return new GetPurchaseOrdersResponse();
    }

    /**
     * Create an instance of {@link GetPurchaseOrderDetailResponse }
     * 
     */
    public GetPurchaseOrderDetailResponse createGetPurchaseOrderDetailResponse() {
        return new GetPurchaseOrderDetailResponse();
    }

    /**
     * Create an instance of {@link GetInflowReceiptsRequest }
     * 
     */
    public GetInflowReceiptsRequest createGetInflowReceiptsRequest() {
        return new GetInflowReceiptsRequest();
    }

    /**
     * Create an instance of {@link GetInflowReceiptsResponse }
     * 
     */
    public GetInflowReceiptsResponse createGetInflowReceiptsResponse() {
        return new GetInflowReceiptsResponse();
    }

    /**
     * Create an instance of {@link GetServiceabilityResponse }
     * 
     */
    public GetServiceabilityResponse createGetServiceabilityResponse() {
        return new GetServiceabilityResponse();
    }

    /**
     * Create an instance of {@link AddOrEditItemLabelsRequest }
     * 
     */
    public AddOrEditItemLabelsRequest createAddOrEditItemLabelsRequest() {
        return new AddOrEditItemLabelsRequest();
    }

    /**
     * Create an instance of {@link EditGatePassResponse }
     * 
     */
    public EditGatePassResponse createEditGatePassResponse() {
        return new EditGatePassResponse();
    }

    /**
     * Create an instance of {@link GetVendorItemTypesResponse }
     * 
     */
    public GetVendorItemTypesResponse createGetVendorItemTypesResponse() {
        return new GetVendorItemTypesResponse();
    }

    /**
     * Create an instance of {@link DispatchShippingPackageResponse }
     * 
     */
    public DispatchShippingPackageResponse createDispatchShippingPackageResponse() {
        return new DispatchShippingPackageResponse();
    }

    /**
     * Create an instance of {@link DispatchSaleOrderItemsRequest }
     * 
     */
    public DispatchSaleOrderItemsRequest createDispatchSaleOrderItemsRequest() {
        return new DispatchSaleOrderItemsRequest();
    }

    /**
     * Create an instance of {@link DispatchSaleOrderItemsResponse }
     * 
     */
    public DispatchSaleOrderItemsResponse createDispatchSaleOrderItemsResponse() {
        return new DispatchSaleOrderItemsResponse();
    }

    /**
     * Create an instance of {@link SplitShippingPackageRequest }
     * 
     */
    public SplitShippingPackageRequest createSplitShippingPackageRequest() {
        return new SplitShippingPackageRequest();
    }

    /**
     * Create an instance of {@link SplitShippingPackageResponse }
     * 
     */
    public SplitShippingPackageResponse createSplitShippingPackageResponse() {
        return new SplitShippingPackageResponse();
    }

    /**
     * Create an instance of {@link ReceiveReversePickupFromRetailResponse }
     * 
     */
    public ReceiveReversePickupFromRetailResponse createReceiveReversePickupFromRetailResponse() {
        return new ReceiveReversePickupFromRetailResponse();
    }

    /**
     * Create an instance of {@link ReceiveReversePickupFromRetailRequest }
     * 
     */
    public ReceiveReversePickupFromRetailRequest createReceiveReversePickupFromRetailRequest() {
        return new ReceiveReversePickupFromRetailRequest();
    }

    /**
     * Create an instance of {@link CreateFacilityResponse }
     * 
     */
    public CreateFacilityResponse createCreateFacilityResponse() {
        return new CreateFacilityResponse();
    }

    /**
     * Create an instance of {@link EditFacilityResponse }
     * 
     */
    public EditFacilityResponse createEditFacilityResponse() {
        return new EditFacilityResponse();
    }

    /**
     * Create an instance of {@link CreateInvoiceAndAllocateShippingProviderResponse }
     * 
     */
    public CreateInvoiceAndAllocateShippingProviderResponse createCreateInvoiceAndAllocateShippingProviderResponse() {
        return new CreateInvoiceAndAllocateShippingProviderResponse();
    }

    /**
     * Create an instance of {@link CreateASNRequest }
     * 
     */
    public CreateASNRequest createCreateASNRequest() {
        return new CreateASNRequest();
    }

    /**
     * Create an instance of {@link CreateASNResponse }
     * 
     */
    public CreateASNResponse createCreateASNResponse() {
        return new CreateASNResponse();
    }

    /**
     * Create an instance of {@link SetSaleOrderPriorityResponse }
     * 
     */
    public SetSaleOrderPriorityResponse createSetSaleOrderPriorityResponse() {
        return new SetSaleOrderPriorityResponse();
    }

    /**
     * Create an instance of {@link CreateGatePassResponse }
     * 
     */
    public CreateGatePassResponse createCreateGatePassResponse() {
        return new CreateGatePassResponse();
    }

    /**
     * Create an instance of {@link AddItemToGatePassResponse }
     * 
     */
    public AddItemToGatePassResponse createAddItemToGatePassResponse() {
        return new AddItemToGatePassResponse();
    }

    /**
     * Create an instance of {@link AddOrEditNonTraceableGatePassItemResponse }
     * 
     */
    public AddOrEditNonTraceableGatePassItemResponse createAddOrEditNonTraceableGatePassItemResponse() {
        return new AddOrEditNonTraceableGatePassItemResponse();
    }

    /**
     * Create an instance of {@link AddNonTraceableGatePassItemResponse }
     * 
     */
    public AddNonTraceableGatePassItemResponse createAddNonTraceableGatePassItemResponse() {
        return new AddNonTraceableGatePassItemResponse();
    }

    /**
     * Create an instance of {@link CompleteGatePassResponse }
     * 
     */
    public CompleteGatePassResponse createCompleteGatePassResponse() {
        return new CompleteGatePassResponse();
    }

    /**
     * Create an instance of {@link AutoCompletePutawayRequest }
     * 
     */
    public AutoCompletePutawayRequest createAutoCompletePutawayRequest() {
        return new AutoCompletePutawayRequest();
    }

    /**
     * Create an instance of {@link AutoCompletePutawayResponse }
     * 
     */
    public AutoCompletePutawayResponse createAutoCompletePutawayResponse() {
        return new AutoCompletePutawayResponse();
    }

    /**
     * Create an instance of {@link PickShippingPackageRequest }
     * 
     */
    public PickShippingPackageRequest createPickShippingPackageRequest() {
        return new PickShippingPackageRequest();
    }

    /**
     * Create an instance of {@link PickShippingPackageResponse }
     * 
     */
    public PickShippingPackageResponse createPickShippingPackageResponse() {
        return new PickShippingPackageResponse();
    }

    /**
     * Create an instance of {@link UnblockSaleOrderItemsInventoryRequest }
     * 
     */
    public UnblockSaleOrderItemsInventoryRequest createUnblockSaleOrderItemsInventoryRequest() {
        return new UnblockSaleOrderItemsInventoryRequest();
    }

    /**
     * Create an instance of {@link UnblockSaleOrderItemsInventoryResponse }
     * 
     */
    public UnblockSaleOrderItemsInventoryResponse createUnblockSaleOrderItemsInventoryResponse() {
        return new UnblockSaleOrderItemsInventoryResponse();
    }

    /**
     * Create an instance of {@link ModifyPacketSaleOrderRequest }
     * 
     */
    public ModifyPacketSaleOrderRequest createModifyPacketSaleOrderRequest() {
        return new ModifyPacketSaleOrderRequest();
    }

    /**
     * Create an instance of {@link ModifyPacketSaleOrderResponse }
     * 
     */
    public ModifyPacketSaleOrderResponse createModifyPacketSaleOrderResponse() {
        return new ModifyPacketSaleOrderResponse();
    }

    /**
     * Create an instance of {@link GetItemTypeInventoryResponse }
     * 
     */
    public GetItemTypeInventoryResponse createGetItemTypeInventoryResponse() {
        return new GetItemTypeInventoryResponse();
    }

    /**
     * Create an instance of {@link GetTaxTypeConfigurationResponse }
     * 
     */
    public GetTaxTypeConfigurationResponse createGetTaxTypeConfigurationResponse() {
        return new GetTaxTypeConfigurationResponse();
    }

    /**
     * Create an instance of {@link SearchShippingPackageResponse }
     * 
     */
    public SearchShippingPackageResponse createSearchShippingPackageResponse() {
        return new SearchShippingPackageResponse();
    }

    /**
     * Create an instance of {@link SearchShippingPackageRequest }
     * 
     */
    public SearchShippingPackageRequest createSearchShippingPackageRequest() {
        return new SearchShippingPackageRequest();
    }

    /**
     * Create an instance of {@link CreateInvoiceResponse }
     * 
     */
    public CreateInvoiceResponse createCreateInvoiceResponse() {
        return new CreateInvoiceResponse();
    }

    /**
     * Create an instance of {@link GetInvoiceLabelResponse }
     * 
     */
    public GetInvoiceLabelResponse createGetInvoiceLabelResponse() {
        return new GetInvoiceLabelResponse();
    }

    /**
     * Create an instance of {@link MarkSaleOrderReturnedRequest }
     * 
     */
    public MarkSaleOrderReturnedRequest createMarkSaleOrderReturnedRequest() {
        return new MarkSaleOrderReturnedRequest();
    }

    /**
     * Create an instance of {@link MarkSaleOrderReturnedResponse }
     * 
     */
    public MarkSaleOrderReturnedResponse createMarkSaleOrderReturnedResponse() {
        return new MarkSaleOrderReturnedResponse();
    }

    /**
     * Create an instance of {@link CreateInflowReceiptResponse }
     * 
     */
    public CreateInflowReceiptResponse createCreateInflowReceiptResponse() {
        return new CreateInflowReceiptResponse();
    }

    /**
     * Create an instance of {@link AddItemToInflowReceiptResponse }
     * 
     */
    public AddItemToInflowReceiptResponse createAddItemToInflowReceiptResponse() {
        return new AddItemToInflowReceiptResponse();
    }

    /**
     * Create an instance of {@link AddShipmentsToBatchRequest }
     * 
     */
    public AddShipmentsToBatchRequest createAddShipmentsToBatchRequest() {
        return new AddShipmentsToBatchRequest();
    }

    /**
     * Create an instance of {@link AddShipmentsToBatchResponse }
     * 
     */
    public AddShipmentsToBatchResponse createAddShipmentsToBatchResponse() {
        return new AddShipmentsToBatchResponse();
    }

    /**
     * Create an instance of {@link CreateVendorCreditInvoiceResponse }
     * 
     */
    public CreateVendorCreditInvoiceResponse createCreateVendorCreditInvoiceResponse() {
        return new CreateVendorCreditInvoiceResponse();
    }

    /**
     * Create an instance of {@link AddEditVendorInvoiceItemResponse }
     * 
     */
    public AddEditVendorInvoiceItemResponse createAddEditVendorInvoiceItemResponse() {
        return new AddEditVendorInvoiceItemResponse();
    }

    /**
     * Create an instance of {@link AddEditVendorInvoiceItemRequest }
     * 
     */
    public AddEditVendorInvoiceItemRequest createAddEditVendorInvoiceItemRequest() {
        return new AddEditVendorInvoiceItemRequest();
    }

    /**
     * Create an instance of {@link EditShippingPackageResponse }
     * 
     */
    public EditShippingPackageResponse createEditShippingPackageResponse() {
        return new EditShippingPackageResponse();
    }

    /**
     * Create an instance of {@link CreateBatchResponse }
     * 
     */
    public CreateBatchResponse createCreateBatchResponse() {
        return new CreateBatchResponse();
    }

    /**
     * Create an instance of {@link EditAdvanceShippingNoticeResponse }
     * 
     */
    public EditAdvanceShippingNoticeResponse createEditAdvanceShippingNoticeResponse() {
        return new EditAdvanceShippingNoticeResponse();
    }

    /**
     * Create an instance of {@link SearchGatePassResponse }
     * 
     */
    public SearchGatePassResponse createSearchGatePassResponse() {
        return new SearchGatePassResponse();
    }

    /**
     * Create an instance of {@link SearchGatePassRequest }
     * 
     */
    public SearchGatePassRequest createSearchGatePassRequest() {
        return new SearchGatePassRequest();
    }

    /**
     * Create an instance of {@link CreatePutawayResponse }
     * 
     */
    public CreatePutawayResponse createCreatePutawayResponse() {
        return new CreatePutawayResponse();
    }

    /**
     * Create an instance of {@link CreatePutawayListResponse }
     * 
     */
    public CreatePutawayListResponse createCreatePutawayListResponse() {
        return new CreatePutawayListResponse();
    }

    /**
     * Create an instance of {@link CompletePutawayResponse }
     * 
     */
    public CompletePutawayResponse createCompletePutawayResponse() {
        return new CompletePutawayResponse();
    }

    /**
     * Create an instance of {@link AddReversePickupSaleOrderItemsToPutawayResponse }
     * 
     */
    public AddReversePickupSaleOrderItemsToPutawayResponse createAddReversePickupSaleOrderItemsToPutawayResponse() {
        return new AddReversePickupSaleOrderItemsToPutawayResponse();
    }

    /**
     * Create an instance of {@link GetItemTypeResponse }
     * 
     */
    public GetItemTypeResponse createGetItemTypeResponse() {
        return new GetItemTypeResponse();
    }

    /**
     * Create an instance of {@link AddOrEditShippingProviderLocationResponse }
     * 
     */
    public AddOrEditShippingProviderLocationResponse createAddOrEditShippingProviderLocationResponse() {
        return new AddOrEditShippingProviderLocationResponse();
    }

    /**
     * Create an instance of {@link SwitchSaleOrderItemFacilityRequest }
     * 
     */
    public SwitchSaleOrderItemFacilityRequest createSwitchSaleOrderItemFacilityRequest() {
        return new SwitchSaleOrderItemFacilityRequest();
    }

    /**
     * Create an instance of {@link SwitchSaleOrderItemFacilityResponse }
     * 
     */
    public SwitchSaleOrderItemFacilityResponse createSwitchSaleOrderItemFacilityResponse() {
        return new SwitchSaleOrderItemFacilityResponse();
    }

    /**
     * Create an instance of {@link AddItemDetailsRequest }
     * 
     */
    public AddItemDetailsRequest createAddItemDetailsRequest() {
        return new AddItemDetailsRequest();
    }

    /**
     * Create an instance of {@link AddItemDetailsResponse }
     * 
     */
    public AddItemDetailsResponse createAddItemDetailsResponse() {
        return new AddItemDetailsResponse();
    }

    /**
     * Create an instance of {@link GetInvoiceDetailsResponse }
     * 
     */
    public GetInvoiceDetailsResponse createGetInvoiceDetailsResponse() {
        return new GetInvoiceDetailsResponse();
    }

    /**
     * Create an instance of {@link CreateInvoiceWithDetailsRequest }
     * 
     */
    public CreateInvoiceWithDetailsRequest createCreateInvoiceWithDetailsRequest() {
        return new CreateInvoiceWithDetailsRequest();
    }

    /**
     * Create an instance of {@link CreateInvoiceWithDetailsResponse }
     * 
     */
    public CreateInvoiceWithDetailsResponse createCreateInvoiceWithDetailsResponse() {
        return new CreateInvoiceWithDetailsResponse();
    }

    /**
     * Create an instance of {@link MarkShippingPackageDeliveredResponse }
     * 
     */
    public MarkShippingPackageDeliveredResponse createMarkShippingPackageDeliveredResponse() {
        return new MarkShippingPackageDeliveredResponse();
    }

    /**
     * Create an instance of {@link MarkSaleOrderItemsDeliveredRequest }
     * 
     */
    public MarkSaleOrderItemsDeliveredRequest createMarkSaleOrderItemsDeliveredRequest() {
        return new MarkSaleOrderItemsDeliveredRequest();
    }

    /**
     * Create an instance of {@link MarkSaleOrderItemsDeliveredResponse }
     * 
     */
    public MarkSaleOrderItemsDeliveredResponse createMarkSaleOrderItemsDeliveredResponse() {
        return new MarkSaleOrderItemsDeliveredResponse();
    }

    /**
     * Create an instance of {@link VerifyShippingPackagePODCodeResponse }
     * 
     */
    public VerifyShippingPackagePODCodeResponse createVerifyShippingPackagePODCodeResponse() {
        return new VerifyShippingPackagePODCodeResponse();
    }

    /**
     * Create an instance of {@link VerifySaleOrderItemsPODCodeRequest }
     * 
     */
    public VerifySaleOrderItemsPODCodeRequest createVerifySaleOrderItemsPODCodeRequest() {
        return new VerifySaleOrderItemsPODCodeRequest();
    }

    /**
     * Create an instance of {@link VerifySaleOrderItemsPODCodeResponse }
     * 
     */
    public VerifySaleOrderItemsPODCodeResponse createVerifySaleOrderItemsPODCodeResponse() {
        return new VerifySaleOrderItemsPODCodeResponse();
    }

    /**
     * Create an instance of {@link ChangeInvoiceCodeRequest }
     * 
     */
    public ChangeInvoiceCodeRequest createChangeInvoiceCodeRequest() {
        return new ChangeInvoiceCodeRequest();
    }

    /**
     * Create an instance of {@link ChangeInvoiceCodeResponse }
     * 
     */
    public ChangeInvoiceCodeResponse createChangeInvoiceCodeResponse() {
        return new ChangeInvoiceCodeResponse();
    }

    /**
     * Create an instance of {@link CreateInvoiceBySaleOrderCodeRequest }
     * 
     */
    public CreateInvoiceBySaleOrderCodeRequest createCreateInvoiceBySaleOrderCodeRequest() {
        return new CreateInvoiceBySaleOrderCodeRequest();
    }

    /**
     * Create an instance of {@link CreateInvoiceBySaleOrderCodeResponse }
     * 
     */
    public CreateInvoiceBySaleOrderCodeResponse createCreateInvoiceBySaleOrderCodeResponse() {
        return new CreateInvoiceBySaleOrderCodeResponse();
    }

    /**
     * Create an instance of {@link EditChannelItemTypePriceResponse }
     * 
     */
    public EditChannelItemTypePriceResponse createEditChannelItemTypePriceResponse() {
        return new EditChannelItemTypePriceResponse();
    }

    /**
     * Create an instance of {@link WsInflowItemType }
     * 
     */
    public WsInflowItemType createWsInflowItemType() {
        return new WsInflowItemType();
    }

    /**
     * Create an instance of {@link RetailReversePickupItem }
     * 
     */
    public RetailReversePickupItem createRetailReversePickupItem() {
        return new RetailReversePickupItem();
    }

    /**
     * Create an instance of {@link ReversePickupItem }
     * 
     */
    public ReversePickupItem createReversePickupItem() {
        return new ReversePickupItem();
    }
    
    public SaleOrderItem createSaleOrderItem() {
        return new SaleOrderItem();
    }

    /**
     * Create an instance of {@link CreateInvoiceWithDetailsRequest.Invoice }
     * 
     */
    public CreateInvoiceWithDetailsRequest.Invoice createCreateInvoiceWithDetailsRequestInvoice() {
        return new CreateInvoiceWithDetailsRequest.Invoice();
    }

    /**
     * Create an instance of {@link CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems }
     * 
     */
    public CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems createCreateInvoiceWithDetailsRequestInvoiceInvoiceItems() {
        return new CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems();
    }

    /**
     * Create an instance of {@link CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem }
     * 
     */
    public CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem createCreateInvoiceWithDetailsRequestInvoiceInvoiceItemsInvoiceItem() {
        return new CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem();
    }

    /**
     * Create an instance of {@link CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems }
     * 
     */
    public CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems createCreateInvoiceWithDetailsRequestInvoiceInvoiceItemsInvoiceItemSaleOrderItems() {
        return new CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems();
    }

    /**
     * Create an instance of {@link CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems.SaleOrderItem }
     * 
     */
    public CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems.SaleOrderItem createCreateInvoiceWithDetailsRequestInvoiceInvoiceItemsInvoiceItemSaleOrderItemsSaleOrderItem() {
        return new CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems.SaleOrderItem();
    }

    /**
     * Create an instance of {@link CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems.SaleOrderItem.ItemDetails }
     * 
     */
    public CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems.SaleOrderItem.ItemDetails createCreateInvoiceWithDetailsRequestInvoiceInvoiceItemsInvoiceItemSaleOrderItemsSaleOrderItemItemDetails() {
        return new CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems.SaleOrderItem.ItemDetails();
    }

    /**
     * Create an instance of {@link GetInvoiceDetailsResponse.Invoice }
     * 
     */
    public GetInvoiceDetailsResponse.Invoice createGetInvoiceDetailsResponseInvoice() {
        return new GetInvoiceDetailsResponse.Invoice();
    }

    /**
     * Create an instance of {@link GetInvoiceDetailsResponse.Invoice.InvoiceItems }
     * 
     */
    public GetInvoiceDetailsResponse.Invoice.InvoiceItems createGetInvoiceDetailsResponseInvoiceInvoiceItems() {
        return new GetInvoiceDetailsResponse.Invoice.InvoiceItems();
    }

    /**
     * Create an instance of {@link AddItemDetailsRequest.ItemDetails }
     * 
     */
    public AddItemDetailsRequest.ItemDetails createAddItemDetailsRequestItemDetails() {
        return new AddItemDetailsRequest.ItemDetails();
    }

    /**
     * Create an instance of {@link PutawayDTO }
     * 
     */
    public PutawayDTO createPutawayDTO() {
        return new PutawayDTO();
    }

    /**
     * Create an instance of {@link SearchGatePassResponse.GatePasses }
     * 
     */
    public SearchGatePassResponse.GatePasses createSearchGatePassResponseGatePasses() {
        return new SearchGatePassResponse.GatePasses();
    }

    /**
     * Create an instance of {@link MarkSaleOrderReturnedRequest.SaleOrderItems }
     * 
     */
    public MarkSaleOrderReturnedRequest.SaleOrderItems createMarkSaleOrderReturnedRequestSaleOrderItems() {
        return new MarkSaleOrderReturnedRequest.SaleOrderItems();
    }

    /**
     * Create an instance of {@link SearchShippingPackageResponse.ShippingPackages }
     * 
     */
    public SearchShippingPackageResponse.ShippingPackages createSearchShippingPackageResponseShippingPackages() {
        return new SearchShippingPackageResponse.ShippingPackages();
    }

    /**
     * Create an instance of {@link GetTaxTypeConfigurationResponse.TaxTypeConfigurations }
     * 
     */
    public GetTaxTypeConfigurationResponse.TaxTypeConfigurations createGetTaxTypeConfigurationResponseTaxTypeConfigurations() {
        return new GetTaxTypeConfigurationResponse.TaxTypeConfigurations();
    }

    /**
     * Create an instance of {@link GetItemTypeInventoryResponse.ItemTypeInventoryDetails }
     * 
     */
    public GetItemTypeInventoryResponse.ItemTypeInventoryDetails createGetItemTypeInventoryResponseItemTypeInventoryDetails() {
        return new GetItemTypeInventoryResponse.ItemTypeInventoryDetails();
    }

    /**
     * Create an instance of {@link WsFacility }
     * 
     */
    public WsFacility createWsFacility() {
        return new WsFacility();
    }

    /**
     * Create an instance of {@link WsFacilityCreate }
     * 
     */
    public WsFacilityCreate createWsFacilityCreate() {
        return new WsFacilityCreate();
    }

    /**
     * Create an instance of {@link SplitShippingPackageResponse.SplittedShippingPackages }
     * 
     */
    public SplitShippingPackageResponse.SplittedShippingPackages createSplitShippingPackageResponseSplittedShippingPackages() {
        return new SplitShippingPackageResponse.SplittedShippingPackages();
    }

    /**
     * Create an instance of {@link SplitShippingPackageRequest.SplitSaleOrderItems }
     * 
     */
    public SplitShippingPackageRequest.SplitSaleOrderItems createSplitShippingPackageRequestSplitSaleOrderItems() {
        return new SplitShippingPackageRequest.SplitSaleOrderItems();
    }

    /**
     * Create an instance of {@link GetVendorItemTypesResponse.VendorItemTypes }
     * 
     */
    public GetVendorItemTypesResponse.VendorItemTypes createGetVendorItemTypesResponseVendorItemTypes() {
        return new GetVendorItemTypesResponse.VendorItemTypes();
    }

    /**
     * Create an instance of {@link Vendor }
     * 
     */
    public Vendor createVendor() {
        return new Vendor();
    }

    /**
     * Create an instance of {@link GetServiceabilityResponse.Facilities }
     * 
     */
    public GetServiceabilityResponse.Facilities createGetServiceabilityResponseFacilities() {
        return new GetServiceabilityResponse.Facilities();
    }

    /**
     * Create an instance of {@link InflowReceipt }
     * 
     */
    public InflowReceipt createInflowReceipt() {
        return new InflowReceipt();
    }

    /**
     * Create an instance of {@link ItemDetail }
     * 
     */
    public ItemDetail createItemDetail() {
        return new ItemDetail();
    }

    /**
     * Create an instance of {@link CustomFields }
     * 
     */
    public CustomFields createCustomFields() {
        return new CustomFields();
    }

    /**
     * Create an instance of {@link SearchItemTypesResponse.ItemTypes }
     * 
     */
    public SearchItemTypesResponse.ItemTypes createSearchItemTypesResponseItemTypes() {
        return new SearchItemTypesResponse.ItemTypes();
    }

    /**
     * Create an instance of {@link SearchItemTypesResponse.ItemTypes.ItemType }
     * 
     */
    public SearchItemTypesResponse.ItemTypes.ItemType createSearchItemTypesResponseItemTypesItemType() {
        return new SearchItemTypesResponse.ItemTypes.ItemType();
    }

    /**
     * Create an instance of {@link AcceptSaleOrderItemAlternateRequest.SaleOrderItems }
     * 
     */
    public AcceptSaleOrderItemAlternateRequest.SaleOrderItems createAcceptSaleOrderItemAlternateRequestSaleOrderItems() {
        return new AcceptSaleOrderItemAlternateRequest.SaleOrderItems();
    }

    /**
     * Create an instance of {@link CreateSaleOrderItemAlternateRequest.SaleOrderItemAlternates }
     * 
     */
    public CreateSaleOrderItemAlternateRequest.SaleOrderItemAlternates createCreateSaleOrderItemAlternateRequestSaleOrderItemAlternates() {
        return new CreateSaleOrderItemAlternateRequest.SaleOrderItemAlternates();
    }

    /**
     * Create an instance of {@link CreateSaleOrderItemAlternateRequest.SaleOrderItems }
     * 
     */
    public CreateSaleOrderItemAlternateRequest.SaleOrderItems createCreateSaleOrderItemAlternateRequestSaleOrderItems() {
        return new CreateSaleOrderItemAlternateRequest.SaleOrderItems();
    }

    /**
     * Create an instance of {@link GetInventorySnapshotResponse.InventorySnapshots }
     * 
     */
    public GetInventorySnapshotResponse.InventorySnapshots createGetInventorySnapshotResponseInventorySnapshots() {
        return new GetInventorySnapshotResponse.InventorySnapshots();
    }

    /**
     * Create an instance of {@link GetInventorySnapshotRequest.ItemTypes }
     * 
     */
    public GetInventorySnapshotRequest.ItemTypes createGetInventorySnapshotRequestItemTypes() {
        return new GetInventorySnapshotRequest.ItemTypes();
    }

    /**
     * Create an instance of {@link SaleOrderAddress }
     * 
     */
    public SaleOrderAddress createSaleOrderAddress() {
        return new SaleOrderAddress();
    }

    /**
     * Create an instance of {@link SearchSaleOrderResponse.SaleOrders }
     * 
     */
    public SearchSaleOrderResponse.SaleOrders createSearchSaleOrderResponseSaleOrders() {
        return new SearchSaleOrderResponse.SaleOrders();
    }

    /**
     * Create an instance of {@link ItemTypeRequest }
     * 
     */
    public ItemTypeRequest createItemTypeRequest() {
        return new ItemTypeRequest();
    }

    /**
     * Create an instance of {@link GetSaleOrderResponse.SaleOrder }
     * 
     */
    public GetSaleOrderResponse.SaleOrder createGetSaleOrderResponseSaleOrder() {
        return new GetSaleOrderResponse.SaleOrder();
    }

    /**
     * Create an instance of {@link GetSaleOrderResponse.SaleOrder.ShippingPackages }
     * 
     */
    public GetSaleOrderResponse.SaleOrder.ShippingPackages createGetSaleOrderResponseSaleOrderShippingPackages() {
        return new GetSaleOrderResponse.SaleOrder.ShippingPackages();
    }

    /**
     * Create an instance of {@link GetSaleOrderResponse.SaleOrder.SaleOrderItems }
     * 
     */
    public GetSaleOrderResponse.SaleOrder.SaleOrderItems createGetSaleOrderResponseSaleOrderSaleOrderItems() {
        return new GetSaleOrderResponse.SaleOrder.SaleOrderItems();
    }

    /**
     * Create an instance of {@link UnholdSaleOrderItemsRequest.SaleOrder }
     * 
     */
    public UnholdSaleOrderItemsRequest.SaleOrder createUnholdSaleOrderItemsRequestSaleOrder() {
        return new UnholdSaleOrderItemsRequest.SaleOrder();
    }

    /**
     * Create an instance of {@link UnholdSaleOrderItemsRequest.SaleOrder.SaleOrderItems }
     * 
     */
    public UnholdSaleOrderItemsRequest.SaleOrder.SaleOrderItems createUnholdSaleOrderItemsRequestSaleOrderSaleOrderItems() {
        return new UnholdSaleOrderItemsRequest.SaleOrder.SaleOrderItems();
    }

    /**
     * Create an instance of {@link HoldSaleOrderItemsRequest.SaleOrder }
     * 
     */
    public HoldSaleOrderItemsRequest.SaleOrder createHoldSaleOrderItemsRequestSaleOrder() {
        return new HoldSaleOrderItemsRequest.SaleOrder();
    }

    /**
     * Create an instance of {@link HoldSaleOrderItemsRequest.SaleOrder.SaleOrderItems }
     * 
     */
    public HoldSaleOrderItemsRequest.SaleOrder.SaleOrderItems createHoldSaleOrderItemsRequestSaleOrderSaleOrderItems() {
        return new HoldSaleOrderItemsRequest.SaleOrder.SaleOrderItems();
    }

    /**
     * Create an instance of {@link CancelSaleOrderRequest.SaleOrder }
     * 
     */
    public CancelSaleOrderRequest.SaleOrder createCancelSaleOrderRequestSaleOrder() {
        return new CancelSaleOrderRequest.SaleOrder();
    }

    /**
     * Create an instance of {@link CancelSaleOrderRequest.SaleOrder.SaleOrderItems }
     * 
     */
    public CancelSaleOrderRequest.SaleOrder.SaleOrderItems createCancelSaleOrderRequestSaleOrderSaleOrderItems() {
        return new CancelSaleOrderRequest.SaleOrder.SaleOrderItems();
    }

    /**
     * Create an instance of {@link SaleOrder }
     * 
     */
    public SaleOrder createSaleOrder() {
        return new SaleOrder();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link CreateExportJobRequest.ExportFilters }
     * 
     */
    public CreateExportJobRequest.ExportFilters createCreateExportJobRequestExportFilters() {
        return new CreateExportJobRequest.ExportFilters();
    }

    /**
     * Create an instance of {@link CreateExportJobRequest.ExportFilters.ExportFilter }
     * 
     */
    public CreateExportJobRequest.ExportFilters.ExportFilter createCreateExportJobRequestExportFiltersExportFilter() {
        return new CreateExportJobRequest.ExportFilters.ExportFilter();
    }

    /**
     * Create an instance of {@link CreateExportJobRequest.ExportColumns }
     * 
     */
    public CreateExportJobRequest.ExportColumns createCreateExportJobRequestExportColumns() {
        return new CreateExportJobRequest.ExportColumns();
    }

    /**
     * Create an instance of {@link CreateExportJobResponse.Errors }
     * 
     */
    public CreateExportJobResponse.Errors createCreateExportJobResponseErrors() {
        return new CreateExportJobResponse.Errors();
    }

    /**
     * Create an instance of {@link CreateExportJobResponse.Warnings }
     * 
     */
    public CreateExportJobResponse.Warnings createCreateExportJobResponseWarnings() {
        return new CreateExportJobResponse.Warnings();
    }

    /**
     * Create an instance of {@link GetExportJobStatusRequest }
     * 
     */
    public GetExportJobStatusRequest createGetExportJobStatusRequest() {
        return new GetExportJobStatusRequest();
    }

    /**
     * Create an instance of {@link GetExportJobStatusResponse.Errors }
     * 
     */
    public GetExportJobStatusResponse.Errors createGetExportJobStatusResponseErrors() {
        return new GetExportJobStatusResponse.Errors();
    }

    /**
     * Create an instance of {@link GetExportJobStatusResponse.Warnings }
     * 
     */
    public GetExportJobStatusResponse.Warnings createGetExportJobStatusResponseWarnings() {
        return new GetExportJobStatusResponse.Warnings();
    }

    /**
     * Create an instance of {@link CreateSaleOrderRequest }
     * 
     */
    public CreateSaleOrderRequest createCreateSaleOrderRequest() {
        return new CreateSaleOrderRequest();
    }

    /**
     * Create an instance of {@link HoldSaleOrderRequest.SaleOrder }
     * 
     */
    public HoldSaleOrderRequest.SaleOrder createHoldSaleOrderRequestSaleOrder() {
        return new HoldSaleOrderRequest.SaleOrder();
    }

    /**
     * Create an instance of {@link UnholdSaleOrderRequest.SaleOrder }
     * 
     */
    public UnholdSaleOrderRequest.SaleOrder createUnholdSaleOrderRequestSaleOrder() {
        return new UnholdSaleOrderRequest.SaleOrder();
    }

    /**
     * Create an instance of {@link GetSaleOrderRequest.SaleOrder }
     * 
     */
    public GetSaleOrderRequest.SaleOrder createGetSaleOrderRequestSaleOrder() {
        return new GetSaleOrderRequest.SaleOrder();
    }

    /**
     * Create an instance of {@link GetSaleOrderResponse.Errors }
     * 
     */
    public GetSaleOrderResponse.Errors createGetSaleOrderResponseErrors() {
        return new GetSaleOrderResponse.Errors();
    }

    /**
     * Create an instance of {@link GetSaleOrderResponse.Warnings }
     * 
     */
    public GetSaleOrderResponse.Warnings createGetSaleOrderResponseWarnings() {
        return new GetSaleOrderResponse.Warnings();
    }

    /**
     * Create an instance of {@link CreateOrEditFacilityItemTypeRequest.FacilityItemTypes }
     * 
     */
    public CreateOrEditFacilityItemTypeRequest.FacilityItemTypes createCreateOrEditFacilityItemTypeRequestFacilityItemTypes() {
        return new CreateOrEditFacilityItemTypeRequest.FacilityItemTypes();
    }

    /**
     * Create an instance of {@link VendorItemType }
     * 
     */
    public VendorItemType createVendorItemType() {
        return new VendorItemType();
    }

    /**
     * Create an instance of {@link SearchSaleOrderResponse.Errors }
     * 
     */
    public SearchSaleOrderResponse.Errors createSearchSaleOrderResponseErrors() {
        return new SearchSaleOrderResponse.Errors();
    }

    /**
     * Create an instance of {@link SearchSaleOrderResponse.Warnings }
     * 
     */
    public SearchSaleOrderResponse.Warnings createSearchSaleOrderResponseWarnings() {
        return new SearchSaleOrderResponse.Warnings();
    }

    /**
     * Create an instance of {@link SearchSaleOrderRequest.SearchOptions }
     * 
     */
    public SearchSaleOrderRequest.SearchOptions createSearchSaleOrderRequestSearchOptions() {
        return new SearchSaleOrderRequest.SearchOptions();
    }

    /**
     * Create an instance of {@link EditSaleOrderAddressRequest }
     * 
     */
    public EditSaleOrderAddressRequest createEditSaleOrderAddressRequest() {
        return new EditSaleOrderAddressRequest();
    }

    /**
     * Create an instance of {@link GetInventorySnapshotResponse.Errors }
     * 
     */
    public GetInventorySnapshotResponse.Errors createGetInventorySnapshotResponseErrors() {
        return new GetInventorySnapshotResponse.Errors();
    }

    /**
     * Create an instance of {@link GetInventorySnapshotResponse.Warnings }
     * 
     */
    public GetInventorySnapshotResponse.Warnings createGetInventorySnapshotResponseWarnings() {
        return new GetInventorySnapshotResponse.Warnings();
    }

    /**
     * Create an instance of {@link InventoryAdjustmentRequest }
     * 
     */
    public InventoryAdjustmentRequest createInventoryAdjustmentRequest() {
        return new InventoryAdjustmentRequest();
    }

    /**
     * Create an instance of {@link CreatePurchaseOrderRequest }
     * 
     */
    public CreatePurchaseOrderRequest createCreatePurchaseOrderRequest() {
        return new CreatePurchaseOrderRequest();
    }

    /**
     * Create an instance of {@link CreatePurchaseOrderResponse.Errors }
     * 
     */
    public CreatePurchaseOrderResponse.Errors createCreatePurchaseOrderResponseErrors() {
        return new CreatePurchaseOrderResponse.Errors();
    }

    /**
     * Create an instance of {@link CreatePurchaseOrderResponse.Warnings }
     * 
     */
    public CreatePurchaseOrderResponse.Warnings createCreatePurchaseOrderResponseWarnings() {
        return new CreatePurchaseOrderResponse.Warnings();
    }

    /**
     * Create an instance of {@link AddOrEditPurchaseOrderItemsRequest.PurchaseOrderItems }
     * 
     */
    public AddOrEditPurchaseOrderItemsRequest.PurchaseOrderItems createAddOrEditPurchaseOrderItemsRequestPurchaseOrderItems() {
        return new AddOrEditPurchaseOrderItemsRequest.PurchaseOrderItems();
    }

    /**
     * Create an instance of {@link ApprovePurchaseOrderRequest }
     * 
     */
    public ApprovePurchaseOrderRequest createApprovePurchaseOrderRequest() {
        return new ApprovePurchaseOrderRequest();
    }

    /**
     * Create an instance of {@link CreateOrEditCategoryRequest }
     * 
     */
    public CreateOrEditCategoryRequest createCreateOrEditCategoryRequest() {
        return new CreateOrEditCategoryRequest();
    }

    /**
     * Create an instance of {@link CreateApprovedPurchaseOrderRequest.PurchaseOrderItems }
     * 
     */
    public CreateApprovedPurchaseOrderRequest.PurchaseOrderItems createCreateApprovedPurchaseOrderRequestPurchaseOrderItems() {
        return new CreateApprovedPurchaseOrderRequest.PurchaseOrderItems();
    }

    /**
     * Create an instance of {@link CreateApprovedPurchaseOrderResponse.Errors }
     * 
     */
    public CreateApprovedPurchaseOrderResponse.Errors createCreateApprovedPurchaseOrderResponseErrors() {
        return new CreateApprovedPurchaseOrderResponse.Errors();
    }

    /**
     * Create an instance of {@link CreateApprovedPurchaseOrderResponse.Warnings }
     * 
     */
    public CreateApprovedPurchaseOrderResponse.Warnings createCreateApprovedPurchaseOrderResponseWarnings() {
        return new CreateApprovedPurchaseOrderResponse.Warnings();
    }

    /**
     * Create an instance of {@link GetShippingManifestRequest }
     * 
     */
    public GetShippingManifestRequest createGetShippingManifestRequest() {
        return new GetShippingManifestRequest();
    }

    /**
     * Create an instance of {@link GetShippingManifestResponse.Errors }
     * 
     */
    public GetShippingManifestResponse.Errors createGetShippingManifestResponseErrors() {
        return new GetShippingManifestResponse.Errors();
    }

    /**
     * Create an instance of {@link GetShippingManifestResponse.Warnings }
     * 
     */
    public GetShippingManifestResponse.Warnings createGetShippingManifestResponseWarnings() {
        return new GetShippingManifestResponse.Warnings();
    }

    /**
     * Create an instance of {@link GetShippingManifestResponse.ManifestItems }
     * 
     */
    public GetShippingManifestResponse.ManifestItems createGetShippingManifestResponseManifestItems() {
        return new GetShippingManifestResponse.ManifestItems();
    }

    /**
     * Create an instance of {@link SearchItemTypesRequest.SearchOptions }
     * 
     */
    public SearchItemTypesRequest.SearchOptions createSearchItemTypesRequestSearchOptions() {
        return new SearchItemTypesRequest.SearchOptions();
    }

    /**
     * Create an instance of {@link SearchItemTypesResponse.Errors }
     * 
     */
    public SearchItemTypesResponse.Errors createSearchItemTypesResponseErrors() {
        return new SearchItemTypesResponse.Errors();
    }

    /**
     * Create an instance of {@link SearchItemTypesResponse.Warnings }
     * 
     */
    public SearchItemTypesResponse.Warnings createSearchItemTypesResponseWarnings() {
        return new SearchItemTypesResponse.Warnings();
    }

    /**
     * Create an instance of {@link GetItemTypeDetailRequest }
     * 
     */
    public GetItemTypeDetailRequest createGetItemTypeDetailRequest() {
        return new GetItemTypeDetailRequest();
    }

    /**
     * Create an instance of {@link GetItemTypeDetailResponse.Errors }
     * 
     */
    public GetItemTypeDetailResponse.Errors createGetItemTypeDetailResponseErrors() {
        return new GetItemTypeDetailResponse.Errors();
    }

    /**
     * Create an instance of {@link GetItemTypeDetailResponse.Warnings }
     * 
     */
    public GetItemTypeDetailResponse.Warnings createGetItemTypeDetailResponseWarnings() {
        return new GetItemTypeDetailResponse.Warnings();
    }

    /**
     * Create an instance of {@link GetItemTypeDetailResponse.ItemType }
     * 
     */
    public GetItemTypeDetailResponse.ItemType createGetItemTypeDetailResponseItemType() {
        return new GetItemTypeDetailResponse.ItemType();
    }

    /**
     * Create an instance of {@link CreateReversePickupRequest.ReversePickupItems }
     * 
     */
    public CreateReversePickupRequest.ReversePickupItems createCreateReversePickupRequestReversePickupItems() {
        return new CreateReversePickupRequest.ReversePickupItems();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link CreateReversePickupResponse.SaleOrderItemCodes }
     * 
     */
    public CreateReversePickupResponse.SaleOrderItemCodes createCreateReversePickupResponseSaleOrderItemCodes() {
        return new CreateReversePickupResponse.SaleOrderItemCodes();
    }

    /**
     * Create an instance of {@link EditSaleOrderMetadataRequest }
     * 
     */
    public EditSaleOrderMetadataRequest createEditSaleOrderMetadataRequest() {
        return new EditSaleOrderMetadataRequest();
    }

    /**
     * Create an instance of {@link CreateCustomerRequest }
     * 
     */
    public CreateCustomerRequest createCreateCustomerRequest() {
        return new CreateCustomerRequest();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link EditCustomerRequest }
     * 
     */
    public EditCustomerRequest createEditCustomerRequest() {
        return new EditCustomerRequest();
    }

    /**
     * Create an instance of {@link UpdateTrackingStatusRequest }
     * 
     */
    public UpdateTrackingStatusRequest createUpdateTrackingStatusRequest() {
        return new UpdateTrackingStatusRequest();
    }

    /**
     * Create an instance of {@link ClosePurchaseOrderRequest }
     * 
     */
    public ClosePurchaseOrderRequest createClosePurchaseOrderRequest() {
        return new ClosePurchaseOrderRequest();
    }

    /**
     * Create an instance of {@link GetBackOrderItemsRequest.SearchOptions }
     * 
     */
    public GetBackOrderItemsRequest.SearchOptions createGetBackOrderItemsRequestSearchOptions() {
        return new GetBackOrderItemsRequest.SearchOptions();
    }

    /**
     * Create an instance of {@link GetBackOrderItemsResponse.BackOrderItems }
     * 
     */
    public GetBackOrderItemsResponse.BackOrderItems createGetBackOrderItemsResponseBackOrderItems() {
        return new GetBackOrderItemsResponse.BackOrderItems();
    }

    /**
     * Create an instance of {@link ReleaseShelfRequest }
     * 
     */
    public ReleaseShelfRequest createReleaseShelfRequest() {
        return new ReleaseShelfRequest();
    }

    /**
     * Create an instance of {@link ReleaseShelfResponse.Errors }
     * 
     */
    public ReleaseShelfResponse.Errors createReleaseShelfResponseErrors() {
        return new ReleaseShelfResponse.Errors();
    }

    /**
     * Create an instance of {@link ReleaseShelfResponse.Warnings }
     * 
     */
    public ReleaseShelfResponse.Warnings createReleaseShelfResponseWarnings() {
        return new ReleaseShelfResponse.Warnings();
    }

    /**
     * Create an instance of {@link GetItemDetailRequest }
     * 
     */
    public GetItemDetailRequest createGetItemDetailRequest() {
        return new GetItemDetailRequest();
    }

    /**
     * Create an instance of {@link GetItemDetailResponse.Errors }
     * 
     */
    public GetItemDetailResponse.Errors createGetItemDetailResponseErrors() {
        return new GetItemDetailResponse.Errors();
    }

    /**
     * Create an instance of {@link GetItemDetailResponse.Warnings }
     * 
     */
    public GetItemDetailResponse.Warnings createGetItemDetailResponseWarnings() {
        return new GetItemDetailResponse.Warnings();
    }

    /**
     * Create an instance of {@link EditSaleOrderItemMetadataRequest }
     * 
     */
    public EditSaleOrderItemMetadataRequest createEditSaleOrderItemMetadataRequest() {
        return new EditSaleOrderItemMetadataRequest();
    }

    /**
     * Create an instance of {@link GetPurchaseOrdersRequest.ApprovedDateRange }
     * 
     */
    public GetPurchaseOrdersRequest.ApprovedDateRange createGetPurchaseOrdersRequestApprovedDateRange() {
        return new GetPurchaseOrdersRequest.ApprovedDateRange();
    }

    /**
     * Create an instance of {@link GetPurchaseOrdersRequest.CreatedDateRange }
     * 
     */
    public GetPurchaseOrdersRequest.CreatedDateRange createGetPurchaseOrdersRequestCreatedDateRange() {
        return new GetPurchaseOrdersRequest.CreatedDateRange();
    }

    /**
     * Create an instance of {@link GetPurchaseOrdersResponse.Errors }
     * 
     */
    public GetPurchaseOrdersResponse.Errors createGetPurchaseOrdersResponseErrors() {
        return new GetPurchaseOrdersResponse.Errors();
    }

    /**
     * Create an instance of {@link GetPurchaseOrdersResponse.Warnings }
     * 
     */
    public GetPurchaseOrdersResponse.Warnings createGetPurchaseOrdersResponseWarnings() {
        return new GetPurchaseOrdersResponse.Warnings();
    }

    /**
     * Create an instance of {@link GetPurchaseOrdersResponse.PurchaseOrders }
     * 
     */
    public GetPurchaseOrdersResponse.PurchaseOrders createGetPurchaseOrdersResponsePurchaseOrders() {
        return new GetPurchaseOrdersResponse.PurchaseOrders();
    }

    /**
     * Create an instance of {@link GetPurchaseOrderDetailRequest }
     * 
     */
    public GetPurchaseOrderDetailRequest createGetPurchaseOrderDetailRequest() {
        return new GetPurchaseOrderDetailRequest();
    }

    /**
     * Create an instance of {@link GetPurchaseOrderDetailResponse.Errors }
     * 
     */
    public GetPurchaseOrderDetailResponse.Errors createGetPurchaseOrderDetailResponseErrors() {
        return new GetPurchaseOrderDetailResponse.Errors();
    }

    /**
     * Create an instance of {@link GetPurchaseOrderDetailResponse.Warnings }
     * 
     */
    public GetPurchaseOrderDetailResponse.Warnings createGetPurchaseOrderDetailResponseWarnings() {
        return new GetPurchaseOrderDetailResponse.Warnings();
    }

    /**
     * Create an instance of {@link GetPurchaseOrderDetailResponse.PurchaseOrderItems }
     * 
     */
    public GetPurchaseOrderDetailResponse.PurchaseOrderItems createGetPurchaseOrderDetailResponsePurchaseOrderItems() {
        return new GetPurchaseOrderDetailResponse.PurchaseOrderItems();
    }

    /**
     * Create an instance of {@link PartyAddress }
     * 
     */
    public PartyAddress createPartyAddress() {
        return new PartyAddress();
    }

    /**
     * Create an instance of {@link GetInflowReceiptsRequest.CreatedDateRange }
     * 
     */
    public GetInflowReceiptsRequest.CreatedDateRange createGetInflowReceiptsRequestCreatedDateRange() {
        return new GetInflowReceiptsRequest.CreatedDateRange();
    }

    /**
     * Create an instance of {@link GetInflowReceiptsResponse.Errors }
     * 
     */
    public GetInflowReceiptsResponse.Errors createGetInflowReceiptsResponseErrors() {
        return new GetInflowReceiptsResponse.Errors();
    }

    /**
     * Create an instance of {@link GetInflowReceiptsResponse.Warnings }
     * 
     */
    public GetInflowReceiptsResponse.Warnings createGetInflowReceiptsResponseWarnings() {
        return new GetInflowReceiptsResponse.Warnings();
    }

    /**
     * Create an instance of {@link GetInflowReceiptsResponse.InflowReceipts }
     * 
     */
    public GetInflowReceiptsResponse.InflowReceipts createGetInflowReceiptsResponseInflowReceipts() {
        return new GetInflowReceiptsResponse.InflowReceipts();
    }

    /**
     * Create an instance of {@link GetInflowReceiptDetailRequest }
     * 
     */
    public GetInflowReceiptDetailRequest createGetInflowReceiptDetailRequest() {
        return new GetInflowReceiptDetailRequest();
    }

    /**
     * Create an instance of {@link GetInflowReceiptDetailResponse }
     * 
     */
    public GetInflowReceiptDetailResponse createGetInflowReceiptDetailResponse() {
        return new GetInflowReceiptDetailResponse();
    }

    /**
     * Create an instance of {@link EditScriptConfigRequest }
     * 
     */
    public EditScriptConfigRequest createEditScriptConfigRequest() {
        return new EditScriptConfigRequest();
    }

    /**
     * Create an instance of {@link GetServiceabilityRequest }
     * 
     */
    public GetServiceabilityRequest createGetServiceabilityRequest() {
        return new GetServiceabilityRequest();
    }

    /**
     * Create an instance of {@link GetServiceabilityResponse.Errors }
     * 
     */
    public GetServiceabilityResponse.Errors createGetServiceabilityResponseErrors() {
        return new GetServiceabilityResponse.Errors();
    }

    /**
     * Create an instance of {@link GetServiceabilityResponse.Warnings }
     * 
     */
    public GetServiceabilityResponse.Warnings createGetServiceabilityResponseWarnings() {
        return new GetServiceabilityResponse.Warnings();
    }

    /**
     * Create an instance of {@link CreateVendorRequest }
     * 
     */
    public CreateVendorRequest createCreateVendorRequest() {
        return new CreateVendorRequest();
    }

    /**
     * Create an instance of {@link EditVendorRequest }
     * 
     */
    public EditVendorRequest createEditVendorRequest() {
        return new EditVendorRequest();
    }

    /**
     * Create an instance of {@link AddOrEditItemLabelsRequest.ItemCodes }
     * 
     */
    public AddOrEditItemLabelsRequest.ItemCodes createAddOrEditItemLabelsRequestItemCodes() {
        return new AddOrEditItemLabelsRequest.ItemCodes();
    }

    /**
     * Create an instance of {@link EditGatePassRequest }
     * 
     */
    public EditGatePassRequest createEditGatePassRequest() {
        return new EditGatePassRequest();
    }

    /**
     * Create an instance of {@link WsGatePass }
     * 
     */
    public WsGatePass createWsGatePass() {
        return new WsGatePass();
    }

    /**
     * Create an instance of {@link EditGatePassResponse.Errors }
     * 
     */
    public EditGatePassResponse.Errors createEditGatePassResponseErrors() {
        return new EditGatePassResponse.Errors();
    }

    /**
     * Create an instance of {@link EditGatePassResponse.Warnings }
     * 
     */
    public EditGatePassResponse.Warnings createEditGatePassResponseWarnings() {
        return new EditGatePassResponse.Warnings();
    }

    /**
     * Create an instance of {@link GetVendorItemTypesRequest }
     * 
     */
    public GetVendorItemTypesRequest createGetVendorItemTypesRequest() {
        return new GetVendorItemTypesRequest();
    }

    /**
     * Create an instance of {@link GetVendorItemTypesResponse.Errors }
     * 
     */
    public GetVendorItemTypesResponse.Errors createGetVendorItemTypesResponseErrors() {
        return new GetVendorItemTypesResponse.Errors();
    }

    /**
     * Create an instance of {@link GetVendorItemTypesResponse.Warnings }
     * 
     */
    public GetVendorItemTypesResponse.Warnings createGetVendorItemTypesResponseWarnings() {
        return new GetVendorItemTypesResponse.Warnings();
    }

    /**
     * Create an instance of {@link DispatchShippingPackageRequest }
     * 
     */
    public DispatchShippingPackageRequest createDispatchShippingPackageRequest() {
        return new DispatchShippingPackageRequest();
    }

    /**
     * Create an instance of {@link DispatchShippingPackageResponse.Errors }
     * 
     */
    public DispatchShippingPackageResponse.Errors createDispatchShippingPackageResponseErrors() {
        return new DispatchShippingPackageResponse.Errors();
    }

    /**
     * Create an instance of {@link DispatchShippingPackageResponse.Warnings }
     * 
     */
    public DispatchShippingPackageResponse.Warnings createDispatchShippingPackageResponseWarnings() {
        return new DispatchShippingPackageResponse.Warnings();
    }

    /**
     * Create an instance of {@link DispatchSaleOrderItemsRequest.SaleOrderItemCodes }
     * 
     */
    public DispatchSaleOrderItemsRequest.SaleOrderItemCodes createDispatchSaleOrderItemsRequestSaleOrderItemCodes() {
        return new DispatchSaleOrderItemsRequest.SaleOrderItemCodes();
    }

    /**
     * Create an instance of {@link DispatchSaleOrderItemsResponse.Errors }
     * 
     */
    public DispatchSaleOrderItemsResponse.Errors createDispatchSaleOrderItemsResponseErrors() {
        return new DispatchSaleOrderItemsResponse.Errors();
    }

    /**
     * Create an instance of {@link DispatchSaleOrderItemsResponse.Warnings }
     * 
     */
    public DispatchSaleOrderItemsResponse.Warnings createDispatchSaleOrderItemsResponseWarnings() {
        return new DispatchSaleOrderItemsResponse.Warnings();
    }

    /**
     * Create an instance of {@link SplitShippingPackageResponse.Errors }
     * 
     */
    public SplitShippingPackageResponse.Errors createSplitShippingPackageResponseErrors() {
        return new SplitShippingPackageResponse.Errors();
    }

    /**
     * Create an instance of {@link SplitShippingPackageResponse.Warnings }
     * 
     */
    public SplitShippingPackageResponse.Warnings createSplitShippingPackageResponseWarnings() {
        return new SplitShippingPackageResponse.Warnings();
    }

    /**
     * Create an instance of {@link ReceiveReversePickupFromRetailResponse.Errors }
     * 
     */
    public ReceiveReversePickupFromRetailResponse.Errors createReceiveReversePickupFromRetailResponseErrors() {
        return new ReceiveReversePickupFromRetailResponse.Errors();
    }

    /**
     * Create an instance of {@link ReceiveReversePickupFromRetailResponse.Warnings }
     * 
     */
    public ReceiveReversePickupFromRetailResponse.Warnings createReceiveReversePickupFromRetailResponseWarnings() {
        return new ReceiveReversePickupFromRetailResponse.Warnings();
    }

    /**
     * Create an instance of {@link ReceiveReversePickupFromRetailRequest.ReversePickupItems }
     * 
     */
    public ReceiveReversePickupFromRetailRequest.ReversePickupItems createReceiveReversePickupFromRetailRequestReversePickupItems() {
        return new ReceiveReversePickupFromRetailRequest.ReversePickupItems();
    }

    /**
     * Create an instance of {@link CreateFacilityRequest }
     * 
     */
    public CreateFacilityRequest createCreateFacilityRequest() {
        return new CreateFacilityRequest();
    }

    /**
     * Create an instance of {@link EditFacilityRequest }
     * 
     */
    public EditFacilityRequest createEditFacilityRequest() {
        return new EditFacilityRequest();
    }

    /**
     * Create an instance of {@link WsSequence }
     * 
     */
    public WsSequence createWsSequence() {
        return new WsSequence();
    }

    /**
     * Create an instance of {@link CreateFacilityResponse.Errors }
     * 
     */
    public CreateFacilityResponse.Errors createCreateFacilityResponseErrors() {
        return new CreateFacilityResponse.Errors();
    }

    /**
     * Create an instance of {@link CreateFacilityResponse.Warnings }
     * 
     */
    public CreateFacilityResponse.Warnings createCreateFacilityResponseWarnings() {
        return new CreateFacilityResponse.Warnings();
    }

    /**
     * Create an instance of {@link FacilityDTO }
     * 
     */
    public FacilityDTO createFacilityDTO() {
        return new FacilityDTO();
    }

    /**
     * Create an instance of {@link PartyAddressDTO }
     * 
     */
    public PartyAddressDTO createPartyAddressDTO() {
        return new PartyAddressDTO();
    }

    /**
     * Create an instance of {@link EditFacilityResponse.Errors }
     * 
     */
    public EditFacilityResponse.Errors createEditFacilityResponseErrors() {
        return new EditFacilityResponse.Errors();
    }

    /**
     * Create an instance of {@link EditFacilityResponse.Warnings }
     * 
     */
    public EditFacilityResponse.Warnings createEditFacilityResponseWarnings() {
        return new EditFacilityResponse.Warnings();
    }

    /**
     * Create an instance of {@link VerifySaleOrderRequest }
     * 
     */
    public VerifySaleOrderRequest createVerifySaleOrderRequest() {
        return new VerifySaleOrderRequest();
    }

    /**
     * Create an instance of {@link MarkItemDamagedOutboundQCRequest }
     * 
     */
    public MarkItemDamagedOutboundQCRequest createMarkItemDamagedOutboundQCRequest() {
        return new MarkItemDamagedOutboundQCRequest();
    }

    /**
     * Create an instance of {@link CreateInvoiceAndAllocateShippingProviderRequest }
     * 
     */
    public CreateInvoiceAndAllocateShippingProviderRequest createCreateInvoiceAndAllocateShippingProviderRequest() {
        return new CreateInvoiceAndAllocateShippingProviderRequest();
    }

    /**
     * Create an instance of {@link CreateInvoiceAndAllocateShippingProviderResponse.Errors }
     * 
     */
    public CreateInvoiceAndAllocateShippingProviderResponse.Errors createCreateInvoiceAndAllocateShippingProviderResponseErrors() {
        return new CreateInvoiceAndAllocateShippingProviderResponse.Errors();
    }

    /**
     * Create an instance of {@link CreateInvoiceAndAllocateShippingProviderResponse.Warnings }
     * 
     */
    public CreateInvoiceAndAllocateShippingProviderResponse.Warnings createCreateInvoiceAndAllocateShippingProviderResponseWarnings() {
        return new CreateInvoiceAndAllocateShippingProviderResponse.Warnings();
    }

    /**
     * Create an instance of {@link CreateASNRequest.AsnItems }
     * 
     */
    public CreateASNRequest.AsnItems createCreateASNRequestAsnItems() {
        return new CreateASNRequest.AsnItems();
    }

    /**
     * Create an instance of {@link CreateASNResponse.Errors }
     * 
     */
    public CreateASNResponse.Errors createCreateASNResponseErrors() {
        return new CreateASNResponse.Errors();
    }

    /**
     * Create an instance of {@link CreateASNResponse.Warnings }
     * 
     */
    public CreateASNResponse.Warnings createCreateASNResponseWarnings() {
        return new CreateASNResponse.Warnings();
    }

    /**
     * Create an instance of {@link SetSaleOrderPriorityRequest }
     * 
     */
    public SetSaleOrderPriorityRequest createSetSaleOrderPriorityRequest() {
        return new SetSaleOrderPriorityRequest();
    }

    /**
     * Create an instance of {@link SetSaleOrderPriorityResponse.Errors }
     * 
     */
    public SetSaleOrderPriorityResponse.Errors createSetSaleOrderPriorityResponseErrors() {
        return new SetSaleOrderPriorityResponse.Errors();
    }

    /**
     * Create an instance of {@link SetSaleOrderPriorityResponse.Warnings }
     * 
     */
    public SetSaleOrderPriorityResponse.Warnings createSetSaleOrderPriorityResponseWarnings() {
        return new SetSaleOrderPriorityResponse.Warnings();
    }

    /**
     * Create an instance of {@link CreateGatePassRequest }
     * 
     */
    public CreateGatePassRequest createCreateGatePassRequest() {
        return new CreateGatePassRequest();
    }

    /**
     * Create an instance of {@link CreateGatePassResponse.Errors }
     * 
     */
    public CreateGatePassResponse.Errors createCreateGatePassResponseErrors() {
        return new CreateGatePassResponse.Errors();
    }

    /**
     * Create an instance of {@link CreateGatePassResponse.Warnings }
     * 
     */
    public CreateGatePassResponse.Warnings createCreateGatePassResponseWarnings() {
        return new CreateGatePassResponse.Warnings();
    }

    /**
     * Create an instance of {@link AddItemToGatePassRequest }
     * 
     */
    public AddItemToGatePassRequest createAddItemToGatePassRequest() {
        return new AddItemToGatePassRequest();
    }

    /**
     * Create an instance of {@link AddItemToGatePassResponse.Errors }
     * 
     */
    public AddItemToGatePassResponse.Errors createAddItemToGatePassResponseErrors() {
        return new AddItemToGatePassResponse.Errors();
    }

    /**
     * Create an instance of {@link AddItemToGatePassResponse.Warnings }
     * 
     */
    public AddItemToGatePassResponse.Warnings createAddItemToGatePassResponseWarnings() {
        return new AddItemToGatePassResponse.Warnings();
    }

    /**
     * Create an instance of {@link AddOrEditNonTraceableGatePassItemRequest }
     * 
     */
    public AddOrEditNonTraceableGatePassItemRequest createAddOrEditNonTraceableGatePassItemRequest() {
        return new AddOrEditNonTraceableGatePassItemRequest();
    }

    /**
     * Create an instance of {@link AddOrEditNonTraceableGatePassItemResponse.Errors }
     * 
     */
    public AddOrEditNonTraceableGatePassItemResponse.Errors createAddOrEditNonTraceableGatePassItemResponseErrors() {
        return new AddOrEditNonTraceableGatePassItemResponse.Errors();
    }

    /**
     * Create an instance of {@link AddOrEditNonTraceableGatePassItemResponse.Warnings }
     * 
     */
    public AddOrEditNonTraceableGatePassItemResponse.Warnings createAddOrEditNonTraceableGatePassItemResponseWarnings() {
        return new AddOrEditNonTraceableGatePassItemResponse.Warnings();
    }

    /**
     * Create an instance of {@link AddNonTraceableGatePassItemRequest }
     * 
     */
    public AddNonTraceableGatePassItemRequest createAddNonTraceableGatePassItemRequest() {
        return new AddNonTraceableGatePassItemRequest();
    }

    /**
     * Create an instance of {@link AddNonTraceableGatePassItemResponse.Errors }
     * 
     */
    public AddNonTraceableGatePassItemResponse.Errors createAddNonTraceableGatePassItemResponseErrors() {
        return new AddNonTraceableGatePassItemResponse.Errors();
    }

    /**
     * Create an instance of {@link AddNonTraceableGatePassItemResponse.Warnings }
     * 
     */
    public AddNonTraceableGatePassItemResponse.Warnings createAddNonTraceableGatePassItemResponseWarnings() {
        return new AddNonTraceableGatePassItemResponse.Warnings();
    }

    /**
     * Create an instance of {@link CompleteGatePassRequest }
     * 
     */
    public CompleteGatePassRequest createCompleteGatePassRequest() {
        return new CompleteGatePassRequest();
    }

    /**
     * Create an instance of {@link CompleteGatePassResponse.Errors }
     * 
     */
    public CompleteGatePassResponse.Errors createCompleteGatePassResponseErrors() {
        return new CompleteGatePassResponse.Errors();
    }

    /**
     * Create an instance of {@link CompleteGatePassResponse.Warnings }
     * 
     */
    public CompleteGatePassResponse.Warnings createCompleteGatePassResponseWarnings() {
        return new CompleteGatePassResponse.Warnings();
    }

    /**
     * Create an instance of {@link AutoCompletePutawayRequest.InflowItemTypes }
     * 
     */
    public AutoCompletePutawayRequest.InflowItemTypes createAutoCompletePutawayRequestInflowItemTypes() {
        return new AutoCompletePutawayRequest.InflowItemTypes();
    }

    /**
     * Create an instance of {@link AutoCompletePutawayResponse.Errors }
     * 
     */
    public AutoCompletePutawayResponse.Errors createAutoCompletePutawayResponseErrors() {
        return new AutoCompletePutawayResponse.Errors();
    }

    /**
     * Create an instance of {@link AutoCompletePutawayResponse.Warnings }
     * 
     */
    public AutoCompletePutawayResponse.Warnings createAutoCompletePutawayResponseWarnings() {
        return new AutoCompletePutawayResponse.Warnings();
    }

    /**
     * Create an instance of {@link PickShippingPackageRequest.ItemCodes }
     * 
     */
    public PickShippingPackageRequest.ItemCodes createPickShippingPackageRequestItemCodes() {
        return new PickShippingPackageRequest.ItemCodes();
    }

    /**
     * Create an instance of {@link PickShippingPackageResponse.Errors }
     * 
     */
    public PickShippingPackageResponse.Errors createPickShippingPackageResponseErrors() {
        return new PickShippingPackageResponse.Errors();
    }

    /**
     * Create an instance of {@link PickShippingPackageResponse.Warnings }
     * 
     */
    public PickShippingPackageResponse.Warnings createPickShippingPackageResponseWarnings() {
        return new PickShippingPackageResponse.Warnings();
    }

    /**
     * Create an instance of {@link UnblockSaleOrderItemsInventoryRequest.SaleOrderItemCodes }
     * 
     */
    public UnblockSaleOrderItemsInventoryRequest.SaleOrderItemCodes createUnblockSaleOrderItemsInventoryRequestSaleOrderItemCodes() {
        return new UnblockSaleOrderItemsInventoryRequest.SaleOrderItemCodes();
    }

    /**
     * Create an instance of {@link UnblockSaleOrderItemsInventoryResponse.Errors }
     * 
     */
    public UnblockSaleOrderItemsInventoryResponse.Errors createUnblockSaleOrderItemsInventoryResponseErrors() {
        return new UnblockSaleOrderItemsInventoryResponse.Errors();
    }

    /**
     * Create an instance of {@link UnblockSaleOrderItemsInventoryResponse.Warnings }
     * 
     */
    public UnblockSaleOrderItemsInventoryResponse.Warnings createUnblockSaleOrderItemsInventoryResponseWarnings() {
        return new UnblockSaleOrderItemsInventoryResponse.Warnings();
    }

    /**
     * Create an instance of {@link ModifyPacketSaleOrderRequest.SaleOrderItemCodes }
     * 
     */
    public ModifyPacketSaleOrderRequest.SaleOrderItemCodes createModifyPacketSaleOrderRequestSaleOrderItemCodes() {
        return new ModifyPacketSaleOrderRequest.SaleOrderItemCodes();
    }

    /**
     * Create an instance of {@link ModifyPacketSaleOrderResponse.Errors }
     * 
     */
    public ModifyPacketSaleOrderResponse.Errors createModifyPacketSaleOrderResponseErrors() {
        return new ModifyPacketSaleOrderResponse.Errors();
    }

    /**
     * Create an instance of {@link ModifyPacketSaleOrderResponse.Warnings }
     * 
     */
    public ModifyPacketSaleOrderResponse.Warnings createModifyPacketSaleOrderResponseWarnings() {
        return new ModifyPacketSaleOrderResponse.Warnings();
    }

    /**
     * Create an instance of {@link GetItemTypeInventoryRequest }
     * 
     */
    public GetItemTypeInventoryRequest createGetItemTypeInventoryRequest() {
        return new GetItemTypeInventoryRequest();
    }

    /**
     * Create an instance of {@link GetItemTypeInventoryResponse.Errors }
     * 
     */
    public GetItemTypeInventoryResponse.Errors createGetItemTypeInventoryResponseErrors() {
        return new GetItemTypeInventoryResponse.Errors();
    }

    /**
     * Create an instance of {@link GetItemTypeInventoryResponse.Warnings }
     * 
     */
    public GetItemTypeInventoryResponse.Warnings createGetItemTypeInventoryResponseWarnings() {
        return new GetItemTypeInventoryResponse.Warnings();
    }

    /**
     * Create an instance of {@link GetTaxTypeConfigurationRequest }
     * 
     */
    public GetTaxTypeConfigurationRequest createGetTaxTypeConfigurationRequest() {
        return new GetTaxTypeConfigurationRequest();
    }

    /**
     * Create an instance of {@link GetTaxTypeConfigurationResponse.Errors }
     * 
     */
    public GetTaxTypeConfigurationResponse.Errors createGetTaxTypeConfigurationResponseErrors() {
        return new GetTaxTypeConfigurationResponse.Errors();
    }

    /**
     * Create an instance of {@link GetTaxTypeConfigurationResponse.Warnings }
     * 
     */
    public GetTaxTypeConfigurationResponse.Warnings createGetTaxTypeConfigurationResponseWarnings() {
        return new GetTaxTypeConfigurationResponse.Warnings();
    }

    /**
     * Create an instance of {@link SearchShippingPackageResponse.Errors }
     * 
     */
    public SearchShippingPackageResponse.Errors createSearchShippingPackageResponseErrors() {
        return new SearchShippingPackageResponse.Errors();
    }

    /**
     * Create an instance of {@link SearchShippingPackageResponse.Warnings }
     * 
     */
    public SearchShippingPackageResponse.Warnings createSearchShippingPackageResponseWarnings() {
        return new SearchShippingPackageResponse.Warnings();
    }

    /**
     * Create an instance of {@link SearchShippingPackageRequest.Statuses }
     * 
     */
    public SearchShippingPackageRequest.Statuses createSearchShippingPackageRequestStatuses() {
        return new SearchShippingPackageRequest.Statuses();
    }

    /**
     * Create an instance of {@link DateRange }
     * 
     */
    public DateRange createDateRange() {
        return new DateRange();
    }

    /**
     * Create an instance of {@link SearchOptions }
     * 
     */
    public SearchOptions createSearchOptions() {
        return new SearchOptions();
    }

    /**
     * Create an instance of {@link CreateInvoiceRequest }
     * 
     */
    public CreateInvoiceRequest createCreateInvoiceRequest() {
        return new CreateInvoiceRequest();
    }

    /**
     * Create an instance of {@link CreateInvoiceResponse.Errors }
     * 
     */
    public CreateInvoiceResponse.Errors createCreateInvoiceResponseErrors() {
        return new CreateInvoiceResponse.Errors();
    }

    /**
     * Create an instance of {@link CreateInvoiceResponse.Warnings }
     * 
     */
    public CreateInvoiceResponse.Warnings createCreateInvoiceResponseWarnings() {
        return new CreateInvoiceResponse.Warnings();
    }

    /**
     * Create an instance of {@link GetInvoiceLabelRequest }
     * 
     */
    public GetInvoiceLabelRequest createGetInvoiceLabelRequest() {
        return new GetInvoiceLabelRequest();
    }

    /**
     * Create an instance of {@link GetInvoiceLabelResponse.Errors }
     * 
     */
    public GetInvoiceLabelResponse.Errors createGetInvoiceLabelResponseErrors() {
        return new GetInvoiceLabelResponse.Errors();
    }

    /**
     * Create an instance of {@link GetInvoiceLabelResponse.Warnings }
     * 
     */
    public GetInvoiceLabelResponse.Warnings createGetInvoiceLabelResponseWarnings() {
        return new GetInvoiceLabelResponse.Warnings();
    }

    /**
     * Create an instance of {@link MarkSaleOrderReturnedResponse.Errors }
     * 
     */
    public MarkSaleOrderReturnedResponse.Errors createMarkSaleOrderReturnedResponseErrors() {
        return new MarkSaleOrderReturnedResponse.Errors();
    }

    /**
     * Create an instance of {@link MarkSaleOrderReturnedResponse.Warnings }
     * 
     */
    public MarkSaleOrderReturnedResponse.Warnings createMarkSaleOrderReturnedResponseWarnings() {
        return new MarkSaleOrderReturnedResponse.Warnings();
    }

    /**
     * Create an instance of {@link CreateInflowReceiptRequest }
     * 
     */
    public CreateInflowReceiptRequest createCreateInflowReceiptRequest() {
        return new CreateInflowReceiptRequest();
    }

    /**
     * Create an instance of {@link GRN }
     * 
     */
    public GRN createGRN() {
        return new GRN();
    }

    /**
     * Create an instance of {@link CreateInflowReceiptResponse.Errors }
     * 
     */
    public CreateInflowReceiptResponse.Errors createCreateInflowReceiptResponseErrors() {
        return new CreateInflowReceiptResponse.Errors();
    }

    /**
     * Create an instance of {@link CreateInflowReceiptResponse.Warnings }
     * 
     */
    public CreateInflowReceiptResponse.Warnings createCreateInflowReceiptResponseWarnings() {
        return new CreateInflowReceiptResponse.Warnings();
    }

    /**
     * Create an instance of {@link AddItemToInflowReceiptRequest }
     * 
     */
    public AddItemToInflowReceiptRequest createAddItemToInflowReceiptRequest() {
        return new AddItemToInflowReceiptRequest();
    }

    /**
     * Create an instance of {@link AddItemToInflowReceiptResponse.Errors }
     * 
     */
    public AddItemToInflowReceiptResponse.Errors createAddItemToInflowReceiptResponseErrors() {
        return new AddItemToInflowReceiptResponse.Errors();
    }

    /**
     * Create an instance of {@link AddItemToInflowReceiptResponse.Warnings }
     * 
     */
    public AddItemToInflowReceiptResponse.Warnings createAddItemToInflowReceiptResponseWarnings() {
        return new AddItemToInflowReceiptResponse.Warnings();
    }

    /**
     * Create an instance of {@link InflowReceiptItem }
     * 
     */
    public InflowReceiptItem createInflowReceiptItem() {
        return new InflowReceiptItem();
    }

    /**
     * Create an instance of {@link AddShipmentsToBatchRequest.ShippingPackageCodes }
     * 
     */
    public AddShipmentsToBatchRequest.ShippingPackageCodes createAddShipmentsToBatchRequestShippingPackageCodes() {
        return new AddShipmentsToBatchRequest.ShippingPackageCodes();
    }

    /**
     * Create an instance of {@link AddShipmentsToBatchResponse.Errors }
     * 
     */
    public AddShipmentsToBatchResponse.Errors createAddShipmentsToBatchResponseErrors() {
        return new AddShipmentsToBatchResponse.Errors();
    }

    /**
     * Create an instance of {@link AddShipmentsToBatchResponse.Warnings }
     * 
     */
    public AddShipmentsToBatchResponse.Warnings createAddShipmentsToBatchResponseWarnings() {
        return new AddShipmentsToBatchResponse.Warnings();
    }

    /**
     * Create an instance of {@link CreateVendorCreditInvoiceResponse.Errors }
     * 
     */
    public CreateVendorCreditInvoiceResponse.Errors createCreateVendorCreditInvoiceResponseErrors() {
        return new CreateVendorCreditInvoiceResponse.Errors();
    }

    /**
     * Create an instance of {@link CreateVendorCreditInvoiceResponse.Warnings }
     * 
     */
    public CreateVendorCreditInvoiceResponse.Warnings createCreateVendorCreditInvoiceResponseWarnings() {
        return new CreateVendorCreditInvoiceResponse.Warnings();
    }

    /**
     * Create an instance of {@link CreateVendorCreditInvoiceRequest }
     * 
     */
    public CreateVendorCreditInvoiceRequest createCreateVendorCreditInvoiceRequest() {
        return new CreateVendorCreditInvoiceRequest();
    }

    /**
     * Create an instance of {@link VendorInvoice }
     * 
     */
    public VendorInvoice createVendorInvoice() {
        return new VendorInvoice();
    }

    /**
     * Create an instance of {@link AddEditVendorInvoiceItemResponse.Errors }
     * 
     */
    public AddEditVendorInvoiceItemResponse.Errors createAddEditVendorInvoiceItemResponseErrors() {
        return new AddEditVendorInvoiceItemResponse.Errors();
    }

    /**
     * Create an instance of {@link AddEditVendorInvoiceItemResponse.Warnings }
     * 
     */
    public AddEditVendorInvoiceItemResponse.Warnings createAddEditVendorInvoiceItemResponseWarnings() {
        return new AddEditVendorInvoiceItemResponse.Warnings();
    }

    /**
     * Create an instance of {@link AddEditVendorInvoiceItemRequest.VendorInvoiceItems }
     * 
     */
    public AddEditVendorInvoiceItemRequest.VendorInvoiceItems createAddEditVendorInvoiceItemRequestVendorInvoiceItems() {
        return new AddEditVendorInvoiceItemRequest.VendorInvoiceItems();
    }

    /**
     * Create an instance of {@link EditShippingPackageRequest }
     * 
     */
    public EditShippingPackageRequest createEditShippingPackageRequest() {
        return new EditShippingPackageRequest();
    }

    /**
     * Create an instance of {@link WsShippingBox }
     * 
     */
    public WsShippingBox createWsShippingBox() {
        return new WsShippingBox();
    }

    /**
     * Create an instance of {@link EditShippingPackageResponse.Errors }
     * 
     */
    public EditShippingPackageResponse.Errors createEditShippingPackageResponseErrors() {
        return new EditShippingPackageResponse.Errors();
    }

    /**
     * Create an instance of {@link EditShippingPackageResponse.Warnings }
     * 
     */
    public EditShippingPackageResponse.Warnings createEditShippingPackageResponseWarnings() {
        return new EditShippingPackageResponse.Warnings();
    }

    /**
     * Create an instance of {@link ShippingPackage }
     * 
     */
    public ShippingPackage createShippingPackage() {
        return new ShippingPackage();
    }

    /**
     * Create an instance of {@link CreateBatchRequest }
     * 
     */
    public CreateBatchRequest createCreateBatchRequest() {
        return new CreateBatchRequest();
    }

    /**
     * Create an instance of {@link CreateBatchResponse.Errors }
     * 
     */
    public CreateBatchResponse.Errors createCreateBatchResponseErrors() {
        return new CreateBatchResponse.Errors();
    }

    /**
     * Create an instance of {@link CreateBatchResponse.Warnings }
     * 
     */
    public CreateBatchResponse.Warnings createCreateBatchResponseWarnings() {
        return new CreateBatchResponse.Warnings();
    }

    /**
     * Create an instance of {@link EditAdvanceShippingNoticeRequest }
     * 
     */
    public EditAdvanceShippingNoticeRequest createEditAdvanceShippingNoticeRequest() {
        return new EditAdvanceShippingNoticeRequest();
    }

    /**
     * Create an instance of {@link EditAdvanceShippingNoticeResponse.Errors }
     * 
     */
    public EditAdvanceShippingNoticeResponse.Errors createEditAdvanceShippingNoticeResponseErrors() {
        return new EditAdvanceShippingNoticeResponse.Errors();
    }

    /**
     * Create an instance of {@link EditAdvanceShippingNoticeResponse.Warnings }
     * 
     */
    public EditAdvanceShippingNoticeResponse.Warnings createEditAdvanceShippingNoticeResponseWarnings() {
        return new EditAdvanceShippingNoticeResponse.Warnings();
    }

    /**
     * Create an instance of {@link SearchGatePassResponse.Errors }
     * 
     */
    public SearchGatePassResponse.Errors createSearchGatePassResponseErrors() {
        return new SearchGatePassResponse.Errors();
    }

    /**
     * Create an instance of {@link SearchGatePassResponse.Warnings }
     * 
     */
    public SearchGatePassResponse.Warnings createSearchGatePassResponseWarnings() {
        return new SearchGatePassResponse.Warnings();
    }

    /**
     * Create an instance of {@link SearchGatePassRequest.SearchOptions }
     * 
     */
    public SearchGatePassRequest.SearchOptions createSearchGatePassRequestSearchOptions() {
        return new SearchGatePassRequest.SearchOptions();
    }

    /**
     * Create an instance of {@link CreatePutawayRequest }
     * 
     */
    public CreatePutawayRequest createCreatePutawayRequest() {
        return new CreatePutawayRequest();
    }

    /**
     * Create an instance of {@link CreatePutawayResponse.Errors }
     * 
     */
    public CreatePutawayResponse.Errors createCreatePutawayResponseErrors() {
        return new CreatePutawayResponse.Errors();
    }

    /**
     * Create an instance of {@link CreatePutawayResponse.Warnings }
     * 
     */
    public CreatePutawayResponse.Warnings createCreatePutawayResponseWarnings() {
        return new CreatePutawayResponse.Warnings();
    }

    /**
     * Create an instance of {@link CreatePutawayListRequest }
     * 
     */
    public CreatePutawayListRequest createCreatePutawayListRequest() {
        return new CreatePutawayListRequest();
    }

    /**
     * Create an instance of {@link CreatePutawayListResponse.Errors }
     * 
     */
    public CreatePutawayListResponse.Errors createCreatePutawayListResponseErrors() {
        return new CreatePutawayListResponse.Errors();
    }

    /**
     * Create an instance of {@link CreatePutawayListResponse.Warnings }
     * 
     */
    public CreatePutawayListResponse.Warnings createCreatePutawayListResponseWarnings() {
        return new CreatePutawayListResponse.Warnings();
    }

    /**
     * Create an instance of {@link CompletePutawayRequest }
     * 
     */
    public CompletePutawayRequest createCompletePutawayRequest() {
        return new CompletePutawayRequest();
    }

    /**
     * Create an instance of {@link CompletePutawayResponse.Errors }
     * 
     */
    public CompletePutawayResponse.Errors createCompletePutawayResponseErrors() {
        return new CompletePutawayResponse.Errors();
    }

    /**
     * Create an instance of {@link CompletePutawayResponse.Warnings }
     * 
     */
    public CompletePutawayResponse.Warnings createCompletePutawayResponseWarnings() {
        return new CompletePutawayResponse.Warnings();
    }

    /**
     * Create an instance of {@link AddReversePickupSaleOrderItemsToPutawayRequest }
     * 
     */
    public AddReversePickupSaleOrderItemsToPutawayRequest createAddReversePickupSaleOrderItemsToPutawayRequest() {
        return new AddReversePickupSaleOrderItemsToPutawayRequest();
    }

    /**
     * Create an instance of {@link AddReversePickupSaleOrderItemsToPutawayResponse.Errors }
     * 
     */
    public AddReversePickupSaleOrderItemsToPutawayResponse.Errors createAddReversePickupSaleOrderItemsToPutawayResponseErrors() {
        return new AddReversePickupSaleOrderItemsToPutawayResponse.Errors();
    }

    /**
     * Create an instance of {@link AddReversePickupSaleOrderItemsToPutawayResponse.Warnings }
     * 
     */
    public AddReversePickupSaleOrderItemsToPutawayResponse.Warnings createAddReversePickupSaleOrderItemsToPutawayResponseWarnings() {
        return new AddReversePickupSaleOrderItemsToPutawayResponse.Warnings();
    }

    /**
     * Create an instance of {@link AddReversePickupSaleOrderItemsToPutawayResponse.PutawayItems }
     * 
     */
    public AddReversePickupSaleOrderItemsToPutawayResponse.PutawayItems createAddReversePickupSaleOrderItemsToPutawayResponsePutawayItems() {
        return new AddReversePickupSaleOrderItemsToPutawayResponse.PutawayItems();
    }

    /**
     * Create an instance of {@link GetItemTypeRequest }
     * 
     */
    public GetItemTypeRequest createGetItemTypeRequest() {
        return new GetItemTypeRequest();
    }

    /**
     * Create an instance of {@link GetItemTypeResponse.Errors }
     * 
     */
    public GetItemTypeResponse.Errors createGetItemTypeResponseErrors() {
        return new GetItemTypeResponse.Errors();
    }

    /**
     * Create an instance of {@link GetItemTypeResponse.Warnings }
     * 
     */
    public GetItemTypeResponse.Warnings createGetItemTypeResponseWarnings() {
        return new GetItemTypeResponse.Warnings();
    }

    /**
     * Create an instance of {@link GetItemTypeResponse.Tags }
     * 
     */
    public GetItemTypeResponse.Tags createGetItemTypeResponseTags() {
        return new GetItemTypeResponse.Tags();
    }

    /**
     * Create an instance of {@link AddOrEditShippingProviderLocationRequest }
     * 
     */
    public AddOrEditShippingProviderLocationRequest createAddOrEditShippingProviderLocationRequest() {
        return new AddOrEditShippingProviderLocationRequest();
    }

    /**
     * Create an instance of {@link AddOrEditShippingProviderLocationResponse.Errors }
     * 
     */
    public AddOrEditShippingProviderLocationResponse.Errors createAddOrEditShippingProviderLocationResponseErrors() {
        return new AddOrEditShippingProviderLocationResponse.Errors();
    }

    /**
     * Create an instance of {@link AddOrEditShippingProviderLocationResponse.Warnings }
     * 
     */
    public AddOrEditShippingProviderLocationResponse.Warnings createAddOrEditShippingProviderLocationResponseWarnings() {
        return new AddOrEditShippingProviderLocationResponse.Warnings();
    }

    /**
     * Create an instance of {@link SwitchSaleOrderItemFacilityRequest.SaleOrderItemCodes }
     * 
     */
    public SwitchSaleOrderItemFacilityRequest.SaleOrderItemCodes createSwitchSaleOrderItemFacilityRequestSaleOrderItemCodes() {
        return new SwitchSaleOrderItemFacilityRequest.SaleOrderItemCodes();
    }

    /**
     * Create an instance of {@link SwitchSaleOrderItemFacilityResponse.Errors }
     * 
     */
    public SwitchSaleOrderItemFacilityResponse.Errors createSwitchSaleOrderItemFacilityResponseErrors() {
        return new SwitchSaleOrderItemFacilityResponse.Errors();
    }

    /**
     * Create an instance of {@link SwitchSaleOrderItemFacilityResponse.Warnings }
     * 
     */
    public SwitchSaleOrderItemFacilityResponse.Warnings createSwitchSaleOrderItemFacilityResponseWarnings() {
        return new SwitchSaleOrderItemFacilityResponse.Warnings();
    }

    /**
     * Create an instance of {@link SwitchSaleOrderItemFacilityResponse.SuccessfulSaleOrderItemCodes }
     * 
     */
    public SwitchSaleOrderItemFacilityResponse.SuccessfulSaleOrderItemCodes createSwitchSaleOrderItemFacilityResponseSuccessfulSaleOrderItemCodes() {
        return new SwitchSaleOrderItemFacilityResponse.SuccessfulSaleOrderItemCodes();
    }

    /**
     * Create an instance of {@link AddItemDetailsResponse.Errors }
     * 
     */
    public AddItemDetailsResponse.Errors createAddItemDetailsResponseErrors() {
        return new AddItemDetailsResponse.Errors();
    }

    /**
     * Create an instance of {@link AddItemDetailsResponse.Warnings }
     * 
     */
    public AddItemDetailsResponse.Warnings createAddItemDetailsResponseWarnings() {
        return new AddItemDetailsResponse.Warnings();
    }

    /**
     * Create an instance of {@link GetInvoiceDetailsRequest }
     * 
     */
    public GetInvoiceDetailsRequest createGetInvoiceDetailsRequest() {
        return new GetInvoiceDetailsRequest();
    }

    /**
     * Create an instance of {@link GetInvoiceDetailsResponse.Errors }
     * 
     */
    public GetInvoiceDetailsResponse.Errors createGetInvoiceDetailsResponseErrors() {
        return new GetInvoiceDetailsResponse.Errors();
    }

    /**
     * Create an instance of {@link GetInvoiceDetailsResponse.Warnings }
     * 
     */
    public GetInvoiceDetailsResponse.Warnings createGetInvoiceDetailsResponseWarnings() {
        return new GetInvoiceDetailsResponse.Warnings();
    }

    /**
     * Create an instance of {@link CreateInvoiceWithDetailsResponse.Errors }
     * 
     */
    public CreateInvoiceWithDetailsResponse.Errors createCreateInvoiceWithDetailsResponseErrors() {
        return new CreateInvoiceWithDetailsResponse.Errors();
    }

    /**
     * Create an instance of {@link CreateInvoiceWithDetailsResponse.Warnings }
     * 
     */
    public CreateInvoiceWithDetailsResponse.Warnings createCreateInvoiceWithDetailsResponseWarnings() {
        return new CreateInvoiceWithDetailsResponse.Warnings();
    }

    /**
     * Create an instance of {@link MarkShippingPackageDeliveredRequest }
     * 
     */
    public MarkShippingPackageDeliveredRequest createMarkShippingPackageDeliveredRequest() {
        return new MarkShippingPackageDeliveredRequest();
    }

    /**
     * Create an instance of {@link MarkShippingPackageDeliveredResponse.Errors }
     * 
     */
    public MarkShippingPackageDeliveredResponse.Errors createMarkShippingPackageDeliveredResponseErrors() {
        return new MarkShippingPackageDeliveredResponse.Errors();
    }

    /**
     * Create an instance of {@link MarkShippingPackageDeliveredResponse.Warnings }
     * 
     */
    public MarkShippingPackageDeliveredResponse.Warnings createMarkShippingPackageDeliveredResponseWarnings() {
        return new MarkShippingPackageDeliveredResponse.Warnings();
    }

    /**
     * Create an instance of {@link MarkSaleOrderItemsDeliveredRequest.SaleOrderItemCodes }
     * 
     */
    public MarkSaleOrderItemsDeliveredRequest.SaleOrderItemCodes createMarkSaleOrderItemsDeliveredRequestSaleOrderItemCodes() {
        return new MarkSaleOrderItemsDeliveredRequest.SaleOrderItemCodes();
    }

    /**
     * Create an instance of {@link MarkSaleOrderItemsDeliveredResponse.Errors }
     * 
     */
    public MarkSaleOrderItemsDeliveredResponse.Errors createMarkSaleOrderItemsDeliveredResponseErrors() {
        return new MarkSaleOrderItemsDeliveredResponse.Errors();
    }

    /**
     * Create an instance of {@link MarkSaleOrderItemsDeliveredResponse.Warnings }
     * 
     */
    public MarkSaleOrderItemsDeliveredResponse.Warnings createMarkSaleOrderItemsDeliveredResponseWarnings() {
        return new MarkSaleOrderItemsDeliveredResponse.Warnings();
    }

    /**
     * Create an instance of {@link VerifyShippingPackagePODCodeRequest }
     * 
     */
    public VerifyShippingPackagePODCodeRequest createVerifyShippingPackagePODCodeRequest() {
        return new VerifyShippingPackagePODCodeRequest();
    }

    /**
     * Create an instance of {@link VerifyShippingPackagePODCodeResponse.Errors }
     * 
     */
    public VerifyShippingPackagePODCodeResponse.Errors createVerifyShippingPackagePODCodeResponseErrors() {
        return new VerifyShippingPackagePODCodeResponse.Errors();
    }

    /**
     * Create an instance of {@link VerifyShippingPackagePODCodeResponse.Warnings }
     * 
     */
    public VerifyShippingPackagePODCodeResponse.Warnings createVerifyShippingPackagePODCodeResponseWarnings() {
        return new VerifyShippingPackagePODCodeResponse.Warnings();
    }

    /**
     * Create an instance of {@link VerifySaleOrderItemsPODCodeRequest.SaleOrderItemCodes }
     * 
     */
    public VerifySaleOrderItemsPODCodeRequest.SaleOrderItemCodes createVerifySaleOrderItemsPODCodeRequestSaleOrderItemCodes() {
        return new VerifySaleOrderItemsPODCodeRequest.SaleOrderItemCodes();
    }

    /**
     * Create an instance of {@link VerifySaleOrderItemsPODCodeResponse.Errors }
     * 
     */
    public VerifySaleOrderItemsPODCodeResponse.Errors createVerifySaleOrderItemsPODCodeResponseErrors() {
        return new VerifySaleOrderItemsPODCodeResponse.Errors();
    }

    /**
     * Create an instance of {@link VerifySaleOrderItemsPODCodeResponse.Warnings }
     * 
     */
    public VerifySaleOrderItemsPODCodeResponse.Warnings createVerifySaleOrderItemsPODCodeResponseWarnings() {
        return new VerifySaleOrderItemsPODCodeResponse.Warnings();
    }

    /**
     * Create an instance of {@link ChangeInvoiceCodeRequest.SaleOrderItemCodes }
     * 
     */
    public ChangeInvoiceCodeRequest.SaleOrderItemCodes createChangeInvoiceCodeRequestSaleOrderItemCodes() {
        return new ChangeInvoiceCodeRequest.SaleOrderItemCodes();
    }

    /**
     * Create an instance of {@link ChangeInvoiceCodeResponse.Errors }
     * 
     */
    public ChangeInvoiceCodeResponse.Errors createChangeInvoiceCodeResponseErrors() {
        return new ChangeInvoiceCodeResponse.Errors();
    }

    /**
     * Create an instance of {@link ChangeInvoiceCodeResponse.Warnings }
     * 
     */
    public ChangeInvoiceCodeResponse.Warnings createChangeInvoiceCodeResponseWarnings() {
        return new ChangeInvoiceCodeResponse.Warnings();
    }

    /**
     * Create an instance of {@link CreateInvoiceBySaleOrderCodeRequest.SaleOrderItemCodes }
     * 
     */
    public CreateInvoiceBySaleOrderCodeRequest.SaleOrderItemCodes createCreateInvoiceBySaleOrderCodeRequestSaleOrderItemCodes() {
        return new CreateInvoiceBySaleOrderCodeRequest.SaleOrderItemCodes();
    }

    /**
     * Create an instance of {@link CreateInvoiceBySaleOrderCodeResponse.Errors }
     * 
     */
    public CreateInvoiceBySaleOrderCodeResponse.Errors createCreateInvoiceBySaleOrderCodeResponseErrors() {
        return new CreateInvoiceBySaleOrderCodeResponse.Errors();
    }

    /**
     * Create an instance of {@link CreateInvoiceBySaleOrderCodeResponse.Warnings }
     * 
     */
    public CreateInvoiceBySaleOrderCodeResponse.Warnings createCreateInvoiceBySaleOrderCodeResponseWarnings() {
        return new CreateInvoiceBySaleOrderCodeResponse.Warnings();
    }

    /**
     * Create an instance of {@link EditChannelItemTypePriceRequest }
     * 
     */
    public EditChannelItemTypePriceRequest createEditChannelItemTypePriceRequest() {
        return new EditChannelItemTypePriceRequest();
    }

    /**
     * Create an instance of {@link EditChannelItemTypePriceResponse.Errors }
     * 
     */
    public EditChannelItemTypePriceResponse.Errors createEditChannelItemTypePriceResponseErrors() {
        return new EditChannelItemTypePriceResponse.Errors();
    }

    /**
     * Create an instance of {@link EditChannelItemTypePriceResponse.Warnings }
     * 
     */
    public EditChannelItemTypePriceResponse.Warnings createEditChannelItemTypePriceResponseWarnings() {
        return new EditChannelItemTypePriceResponse.Warnings();
    }

    /**
     * Create an instance of {@link EditChannelItemTypePriceResponse.ChannelItemTypePrice }
     * 
     */
    public EditChannelItemTypePriceResponse.ChannelItemTypePrice createEditChannelItemTypePriceResponseChannelItemTypePrice() {
        return new EditChannelItemTypePriceResponse.ChannelItemTypePrice();
    }

    /**
     * Create an instance of {@link java.lang.Error }
     * 
     */
    public java.lang.Error createError() {
        return new java.lang.Error();
    }

    /**
     * Create an instance of {@link Warning }
     * 
     */
    public Warning createWarning() {
        return new Warning();
    }

    /**
     * Create an instance of {@link SaleOrderItemCombination }
     * 
     */
    public SaleOrderItemCombination createSaleOrderItemCombination() {
        return new SaleOrderItemCombination();
    }

    /**
     * Create an instance of {@link ShippingProvider }
     * 
     */
    public ShippingProvider createShippingProvider() {
        return new ShippingProvider();
    }

    /**
     * Create an instance of {@link AddressRef }
     * 
     */
    public AddressRef createAddressRef() {
        return new AddressRef();
    }

    /**
     * Create an instance of {@link WsFacilityItemType }
     * 
     */
    public WsFacilityItemType createWsFacilityItemType() {
        return new WsFacilityItemType();
    }

    /**
     * Create an instance of {@link SaleOrderAddressItem }
     * 
     */
    public SaleOrderAddressItem createSaleOrderAddressItem() {
        return new SaleOrderAddressItem();
    }

    /**
     * Create an instance of {@link PurchaseOrderItem }
     * 
     */
    public PurchaseOrderItem createPurchaseOrderItem() {
        return new PurchaseOrderItem();
    }

    /**
     * Create an instance of {@link PartyContact }
     * 
     */
    public PartyContact createPartyContact() {
        return new PartyContact();
    }

    /**
     * Create an instance of {@link VendorAgreement }
     * 
     */
    public VendorAgreement createVendorAgreement() {
        return new VendorAgreement();
    }

    /**
     * Create an instance of {@link ManifestItem }
     * 
     */
    public ManifestItem createManifestItem() {
        return new ManifestItem();
    }

    /**
     * Create an instance of {@link ShippingAddress }
     * 
     */
    public ShippingAddress createShippingAddress() {
        return new ShippingAddress();
    }

    /**
     * Create an instance of {@link ShippingPackageType }
     * 
     */
    public ShippingPackageType createShippingPackageType() {
        return new ShippingPackageType();
    }

    /**
     * Create an instance of {@link InventorySnapshot }
     * 
     */
    public InventorySnapshot createInventorySnapshot() {
        return new InventorySnapshot();
    }

    /**
     * Create an instance of {@link BackOrderItem }
     * 
     */
    public BackOrderItem createBackOrderItem() {
        return new BackOrderItem();
    }

    /**
     * Create an instance of {@link SaleOrderItemDTO }
     * 
     */
    public SaleOrderItemDTO createSaleOrderItemDTO() {
        return new SaleOrderItemDTO();
    }

    /**
     * Create an instance of {@link InflowReceiptItemDTO }
     * 
     */
    public InflowReceiptItemDTO createInflowReceiptItemDTO() {
        return new InflowReceiptItemDTO();
    }

    /**
     * Create an instance of {@link PurchaseOrder }
     * 
     */
    public PurchaseOrder createPurchaseOrder() {
        return new PurchaseOrder();
    }

    /**
     * Create an instance of {@link WsPartyAddress }
     * 
     */
    public WsPartyAddress createWsPartyAddress() {
        return new WsPartyAddress();
    }

    /**
     * Create an instance of {@link AsnItem }
     * 
     */
    public AsnItem createAsnItem() {
        return new AsnItem();
    }

    /**
     * Create an instance of {@link VendorInvoiceItem }
     * 
     */
    public VendorInvoiceItem createVendorInvoiceItem() {
        return new VendorInvoiceItem();
    }

    /**
     * Create an instance of {@link PutawayItemDTO }
     * 
     */
    public PutawayItemDTO createPutawayItemDTO() {
        return new PutawayItemDTO();
    }

    /**
     * Create an instance of {@link WsInflowItemType.ItemCodes }
     * 
     */
    public WsInflowItemType.ItemCodes createWsInflowItemTypeItemCodes() {
        return new WsInflowItemType.ItemCodes();
    }

    /**
     * Create an instance of {@link RetailReversePickupItem.ItemCodes }
     * 
     */
    public RetailReversePickupItem.ItemCodes createRetailReversePickupItemItemCodes() {
        return new RetailReversePickupItem.ItemCodes();
    }

    /**
     * Create an instance of {@link ReversePickupItem.ReversePickupAlternate }
     * 
     */
    public ReversePickupItem.ReversePickupAlternate createReversePickupItemReversePickupAlternate() {
        return new ReversePickupItem.ReversePickupAlternate();
    }

    /**
     * Create an instance of {@link SaleOrderItem.ItemDetailFields }
     * 
     */
    public SaleOrderItem.ItemDetailFields createSaleOrderItemItemDetailFields() {
        return new SaleOrderItem.ItemDetailFields();
    }

    /**
     * Create an instance of {@link CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItemCodes }
     * 
     */
    public CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItemCodes createCreateInvoiceWithDetailsRequestInvoiceInvoiceItemsInvoiceItemSaleOrderItemCodes() {
        return new CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItemCodes();
    }

    /**
     * Create an instance of {@link CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems.SaleOrderItem.ItemDetails.ItemDetail }
     * 
     */
    public CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems.SaleOrderItem.ItemDetails.ItemDetail createCreateInvoiceWithDetailsRequestInvoiceInvoiceItemsInvoiceItemSaleOrderItemsSaleOrderItemItemDetailsItemDetail() {
        return new CreateInvoiceWithDetailsRequest.Invoice.InvoiceItems.InvoiceItem.SaleOrderItems.SaleOrderItem.ItemDetails.ItemDetail();
    }

    /**
     * Create an instance of {@link GetInvoiceDetailsResponse.Invoice.InvoiceItems.InvoiceItem }
     * 
     */
    public GetInvoiceDetailsResponse.Invoice.InvoiceItems.InvoiceItem createGetInvoiceDetailsResponseInvoiceInvoiceItemsInvoiceItem() {
        return new GetInvoiceDetailsResponse.Invoice.InvoiceItems.InvoiceItem();
    }

    /**
     * Create an instance of {@link AddItemDetailsRequest.ItemDetails.ItemDetail }
     * 
     */
    public AddItemDetailsRequest.ItemDetails.ItemDetail createAddItemDetailsRequestItemDetailsItemDetail() {
        return new AddItemDetailsRequest.ItemDetails.ItemDetail();
    }

    /**
     * Create an instance of {@link PutawayDTO.PutawayItems }
     * 
     */
    public PutawayDTO.PutawayItems createPutawayDTOPutawayItems() {
        return new PutawayDTO.PutawayItems();
    }

    /**
     * Create an instance of {@link SearchGatePassResponse.GatePasses.GatePass }
     * 
     */
    public SearchGatePassResponse.GatePasses.GatePass createSearchGatePassResponseGatePassesGatePass() {
        return new SearchGatePassResponse.GatePasses.GatePass();
    }

    /**
     * Create an instance of {@link MarkSaleOrderReturnedRequest.SaleOrderItems.SaleOrderItem }
     * 
     */
    public MarkSaleOrderReturnedRequest.SaleOrderItems.SaleOrderItem createMarkSaleOrderReturnedRequestSaleOrderItemsSaleOrderItem() {
        return new MarkSaleOrderReturnedRequest.SaleOrderItems.SaleOrderItem();
    }

    /**
     * Create an instance of {@link SearchShippingPackageResponse.ShippingPackages.ShippingPackage }
     * 
     */
    public SearchShippingPackageResponse.ShippingPackages.ShippingPackage createSearchShippingPackageResponseShippingPackagesShippingPackage() {
        return new SearchShippingPackageResponse.ShippingPackages.ShippingPackage();
    }

    /**
     * Create an instance of {@link GetTaxTypeConfigurationResponse.TaxTypeConfigurations.TaxTypeConfiguration }
     * 
     */
    public GetTaxTypeConfigurationResponse.TaxTypeConfigurations.TaxTypeConfiguration createGetTaxTypeConfigurationResponseTaxTypeConfigurationsTaxTypeConfiguration() {
        return new GetTaxTypeConfigurationResponse.TaxTypeConfigurations.TaxTypeConfiguration();
    }

    /**
     * Create an instance of {@link GetItemTypeInventoryResponse.ItemTypeInventoryDetails.ItemTypeInventory }
     * 
     */
    public GetItemTypeInventoryResponse.ItemTypeInventoryDetails.ItemTypeInventory createGetItemTypeInventoryResponseItemTypeInventoryDetailsItemTypeInventory() {
        return new GetItemTypeInventoryResponse.ItemTypeInventoryDetails.ItemTypeInventory();
    }

    /**
     * Create an instance of {@link WsFacility.PartyContacts }
     * 
     */
    public WsFacility.PartyContacts createWsFacilityPartyContacts() {
        return new WsFacility.PartyContacts();
    }

    /**
     * Create an instance of {@link WsFacilityCreate.PartyContacts }
     * 
     */
    public WsFacilityCreate.PartyContacts createWsFacilityCreatePartyContacts() {
        return new WsFacilityCreate.PartyContacts();
    }

    /**
     * Create an instance of {@link SplitShippingPackageResponse.SplittedShippingPackages.ShippingPackage }
     * 
     */
    public SplitShippingPackageResponse.SplittedShippingPackages.ShippingPackage createSplitShippingPackageResponseSplittedShippingPackagesShippingPackage() {
        return new SplitShippingPackageResponse.SplittedShippingPackages.ShippingPackage();
    }

    /**
     * Create an instance of {@link SplitShippingPackageRequest.SplitSaleOrderItems.SplitSaleOrderItem }
     * 
     */
    public SplitShippingPackageRequest.SplitSaleOrderItems.SplitSaleOrderItem createSplitShippingPackageRequestSplitSaleOrderItemsSplitSaleOrderItem() {
        return new SplitShippingPackageRequest.SplitSaleOrderItems.SplitSaleOrderItem();
    }

    /**
     * Create an instance of {@link GetVendorItemTypesResponse.VendorItemTypes.VendorItemType }
     * 
     */
    public GetVendorItemTypesResponse.VendorItemTypes.VendorItemType createGetVendorItemTypesResponseVendorItemTypesVendorItemType() {
        return new GetVendorItemTypesResponse.VendorItemTypes.VendorItemType();
    }

    /**
     * Create an instance of {@link Vendor.Agreements }
     * 
     */
    public Vendor.Agreements createVendorAgreements() {
        return new Vendor.Agreements();
    }

    /**
     * Create an instance of {@link Vendor.PartyContacts }
     * 
     */
    public Vendor.PartyContacts createVendorPartyContacts() {
        return new Vendor.PartyContacts();
    }

    /**
     * Create an instance of {@link GetServiceabilityResponse.Facilities.Facility }
     * 
     */
    public GetServiceabilityResponse.Facilities.Facility createGetServiceabilityResponseFacilitiesFacility() {
        return new GetServiceabilityResponse.Facilities.Facility();
    }

    /**
     * Create an instance of {@link InflowReceipt.InflowReceiptItems }
     * 
     */
    public InflowReceipt.InflowReceiptItems createInflowReceiptInflowReceiptItems() {
        return new InflowReceipt.InflowReceiptItems();
    }

    /**
     * Create an instance of {@link ItemDetail.SaleOrderItems }
     * 
     */
    public ItemDetail.SaleOrderItems createItemDetailSaleOrderItems() {
        return new ItemDetail.SaleOrderItems();
    }

    /**
     * Create an instance of {@link CustomFields.CustomField }
     * 
     */
    public CustomFields.CustomField createCustomFieldsCustomField() {
        return new CustomFields.CustomField();
    }

    /**
     * Create an instance of {@link SearchItemTypesResponse.ItemTypes.ItemType.InventorySnapshots }
     * 
     */
    public SearchItemTypesResponse.ItemTypes.ItemType.InventorySnapshots createSearchItemTypesResponseItemTypesItemTypeInventorySnapshots() {
        return new SearchItemTypesResponse.ItemTypes.ItemType.InventorySnapshots();
    }

    /**
     * Create an instance of {@link AcceptSaleOrderItemAlternateRequest.SaleOrderItems.SaleOrderItem }
     * 
     */
    public AcceptSaleOrderItemAlternateRequest.SaleOrderItems.SaleOrderItem createAcceptSaleOrderItemAlternateRequestSaleOrderItemsSaleOrderItem() {
        return new AcceptSaleOrderItemAlternateRequest.SaleOrderItems.SaleOrderItem();
    }

    /**
     * Create an instance of {@link CreateSaleOrderItemAlternateRequest.SaleOrderItemAlternates.SaleOrderItemAlternate }
     * 
     */
    public CreateSaleOrderItemAlternateRequest.SaleOrderItemAlternates.SaleOrderItemAlternate createCreateSaleOrderItemAlternateRequestSaleOrderItemAlternatesSaleOrderItemAlternate() {
        return new CreateSaleOrderItemAlternateRequest.SaleOrderItemAlternates.SaleOrderItemAlternate();
    }

    /**
     * Create an instance of {@link CreateSaleOrderItemAlternateRequest.SaleOrderItems.SaleOrderItem }
     * 
     */
    public CreateSaleOrderItemAlternateRequest.SaleOrderItems.SaleOrderItem createCreateSaleOrderItemAlternateRequestSaleOrderItemsSaleOrderItem() {
        return new CreateSaleOrderItemAlternateRequest.SaleOrderItems.SaleOrderItem();
    }

    /**
     * Create an instance of {@link GetInventorySnapshotResponse.InventorySnapshots.InventorySnapshot }
     * 
     */
    public GetInventorySnapshotResponse.InventorySnapshots.InventorySnapshot createGetInventorySnapshotResponseInventorySnapshotsInventorySnapshot() {
        return new GetInventorySnapshotResponse.InventorySnapshots.InventorySnapshot();
    }

    /**
     * Create an instance of {@link GetInventorySnapshotRequest.ItemTypes.ItemType }
     * 
     */
    public GetInventorySnapshotRequest.ItemTypes.ItemType createGetInventorySnapshotRequestItemTypesItemType() {
        return new GetInventorySnapshotRequest.ItemTypes.ItemType();
    }

    /**
     * Create an instance of {@link SaleOrderAddress.Addresses }
     * 
     */
    public SaleOrderAddress.Addresses createSaleOrderAddressAddresses() {
        return new SaleOrderAddress.Addresses();
    }

    /**
     * Create an instance of {@link SaleOrderAddress.SaleOrderAddressItems }
     * 
     */
    public SaleOrderAddress.SaleOrderAddressItems createSaleOrderAddressSaleOrderAddressItems() {
        return new SaleOrderAddress.SaleOrderAddressItems();
    }

    /**
     * Create an instance of {@link SearchSaleOrderResponse.SaleOrders.SaleOrder }
     * 
     */
    public SearchSaleOrderResponse.SaleOrders.SaleOrder createSearchSaleOrderResponseSaleOrdersSaleOrder() {
        return new SearchSaleOrderResponse.SaleOrders.SaleOrder();
    }

    /**
     * Create an instance of {@link ItemTypeRequest.Tags }
     * 
     */
    public ItemTypeRequest.Tags createItemTypeRequestTags() {
        return new ItemTypeRequest.Tags();
    }

    /**
     * Create an instance of {@link GetSaleOrderResponse.SaleOrder.Addresses }
     * 
     */
    public GetSaleOrderResponse.SaleOrder.Addresses createGetSaleOrderResponseSaleOrderAddresses() {
        return new GetSaleOrderResponse.SaleOrder.Addresses();
    }

    /**
     * Create an instance of {@link GetSaleOrderResponse.SaleOrder.ShippingPackages.ShippingPackage }
     * 
     */
    public GetSaleOrderResponse.SaleOrder.ShippingPackages.ShippingPackage createGetSaleOrderResponseSaleOrderShippingPackagesShippingPackage() {
        return new GetSaleOrderResponse.SaleOrder.ShippingPackages.ShippingPackage();
    }

    /**
     * Create an instance of {@link GetSaleOrderResponse.SaleOrder.SaleOrderItems.SaleOrderItem }
     * 
     */
    public GetSaleOrderResponse.SaleOrder.SaleOrderItems.SaleOrderItem createGetSaleOrderResponseSaleOrderSaleOrderItemsSaleOrderItem() {
        return new GetSaleOrderResponse.SaleOrder.SaleOrderItems.SaleOrderItem();
    }

    /**
     * Create an instance of {@link UnholdSaleOrderItemsRequest.SaleOrder.SaleOrderItems.SaleOrderItem }
     * 
     */
    public UnholdSaleOrderItemsRequest.SaleOrder.SaleOrderItems.SaleOrderItem createUnholdSaleOrderItemsRequestSaleOrderSaleOrderItemsSaleOrderItem() {
        return new UnholdSaleOrderItemsRequest.SaleOrder.SaleOrderItems.SaleOrderItem();
    }

    /**
     * Create an instance of {@link HoldSaleOrderItemsRequest.SaleOrder.SaleOrderItems.SaleOrderItem }
     * 
     */
    public HoldSaleOrderItemsRequest.SaleOrder.SaleOrderItems.SaleOrderItem createHoldSaleOrderItemsRequestSaleOrderSaleOrderItemsSaleOrderItem() {
        return new HoldSaleOrderItemsRequest.SaleOrder.SaleOrderItems.SaleOrderItem();
    }

    /**
     * Create an instance of {@link CancelSaleOrderRequest.SaleOrder.SaleOrderItems.SaleOrderItem }
     * 
     */
    public CancelSaleOrderRequest.SaleOrder.SaleOrderItems.SaleOrderItem createCancelSaleOrderRequestSaleOrderSaleOrderItemsSaleOrderItem() {
        return new CancelSaleOrderRequest.SaleOrder.SaleOrderItems.SaleOrderItem();
    }

    /**
     * Create an instance of {@link SaleOrder.Addresses }
     * 
     */
    public SaleOrder.Addresses createSaleOrderAddresses() {
        return new SaleOrder.Addresses();
    }

    /**
     * Create an instance of {@link SaleOrder.SaleOrderItems }
     * 
     */
    public SaleOrder.SaleOrderItems createSaleOrderSaleOrderItems() {
        return new SaleOrder.SaleOrderItems();
    }

    /**
     * Create an instance of {@link SaleOrder.ShippingProviders }
     * 
     */
    public SaleOrder.ShippingProviders createSaleOrderShippingProviders() {
        return new SaleOrder.ShippingProviders();
    }

    /**
     * Create an instance of {@link SaleOrder.SaleOrderItemCombinations }
     * 
     */
    public SaleOrder.SaleOrderItemCombinations createSaleOrderSaleOrderItemCombinations() {
        return new SaleOrder.SaleOrderItemCombinations();
    }

    /**
     * Create an instance of {@link ServiceResponse.Errors }
     * 
     */
    public ServiceResponse.Errors createServiceResponseErrors() {
        return new ServiceResponse.Errors();
    }

    /**
     * Create an instance of {@link ServiceResponse.Warnings }
     * 
     */
    public ServiceResponse.Warnings createServiceResponseWarnings() {
        return new ServiceResponse.Warnings();
    }

    /**
     * Create an instance of {@link CreateExportJobRequest.ExportFilters.ExportFilter.SelectedValues }
     * 
     */
    public CreateExportJobRequest.ExportFilters.ExportFilter.SelectedValues createCreateExportJobRequestExportFiltersExportFilterSelectedValues() {
        return new CreateExportJobRequest.ExportFilters.ExportFilter.SelectedValues();
    }

    /**
     * Create an instance of {@link CreateExportJobRequest.ExportFilters.ExportFilter.DateRange }
     * 
     */
    public CreateExportJobRequest.ExportFilters.ExportFilter.DateRange createCreateExportJobRequestExportFiltersExportFilterDateRange() {
        return new CreateExportJobRequest.ExportFilters.ExportFilter.DateRange();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "CreateSaleOrderResponse")
    public JAXBElement<ServiceResponse> createCreateSaleOrderResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_CreateSaleOrderResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "CancelSaleOrderResponse")
    public JAXBElement<ServiceResponse> createCancelSaleOrderResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_CancelSaleOrderResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "HoldSaleOrderResponse")
    public JAXBElement<ServiceResponse> createHoldSaleOrderResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_HoldSaleOrderResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "UnholdSaleOrderResponse")
    public JAXBElement<ServiceResponse> createUnholdSaleOrderResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_UnholdSaleOrderResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "HoldSaleOrderItemsResponse")
    public JAXBElement<ServiceResponse> createHoldSaleOrderItemsResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_HoldSaleOrderItemsResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "UnholdSaleOrderItemsResponse")
    public JAXBElement<ServiceResponse> createUnholdSaleOrderItemsResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_UnholdSaleOrderItemsResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemTypeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "CreateItemTypeRequest")
    public JAXBElement<ItemTypeRequest> createCreateItemTypeRequest(ItemTypeRequest value) {
        return new JAXBElement<ItemTypeRequest>(_CreateItemTypeRequest_QNAME, ItemTypeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemTypeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "EditItemTypeRequest")
    public JAXBElement<ItemTypeRequest> createEditItemTypeRequest(ItemTypeRequest value) {
        return new JAXBElement<ItemTypeRequest>(_EditItemTypeRequest_QNAME, ItemTypeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemTypeRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "CreateOrEditItemTypeRequest")
    public JAXBElement<ItemTypeRequest> createCreateOrEditItemTypeRequest(ItemTypeRequest value) {
        return new JAXBElement<ItemTypeRequest>(_CreateOrEditItemTypeRequest_QNAME, ItemTypeRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "CreateItemTypeResponse")
    public JAXBElement<ServiceResponse> createCreateItemTypeResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_CreateItemTypeResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "EditItemTypeResponse")
    public JAXBElement<ServiceResponse> createEditItemTypeResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_EditItemTypeResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "CreateOrEditItemTypeResponse")
    public JAXBElement<ServiceResponse> createCreateOrEditItemTypeResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_CreateOrEditItemTypeResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "CreateOrEditFacilityItemTypeResponse")
    public JAXBElement<ServiceResponse> createCreateOrEditFacilityItemTypeResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_CreateOrEditFacilityItemTypeResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "CreateOrEditCategoryResponse")
    public JAXBElement<ServiceResponse> createCreateOrEditCategoryResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_CreateOrEditCategoryResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "CreateVendorItemTypeRequest")
    public JAXBElement<VendorItemType> createCreateVendorItemTypeRequest(VendorItemType value) {
        return new JAXBElement<VendorItemType>(_CreateVendorItemTypeRequest_QNAME, VendorItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "CreateVendorItemTypeResponse")
    public JAXBElement<ServiceResponse> createCreateVendorItemTypeResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_CreateVendorItemTypeResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "CreateOrEditVendorItemTypeRequest")
    public JAXBElement<VendorItemType> createCreateOrEditVendorItemTypeRequest(VendorItemType value) {
        return new JAXBElement<VendorItemType>(_CreateOrEditVendorItemTypeRequest_QNAME, VendorItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "CreateOrEditVendorItemTypeResponse")
    public JAXBElement<ServiceResponse> createCreateOrEditVendorItemTypeResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_CreateOrEditVendorItemTypeResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "EditSaleOrderAddressResponse")
    public JAXBElement<ServiceResponse> createEditSaleOrderAddressResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_EditSaleOrderAddressResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "InventoryAdjustmentResponse")
    public JAXBElement<ServiceResponse> createInventoryAdjustmentResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_InventoryAdjustmentResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "AddOrEditPurchaseOrderItemsResponse")
    public JAXBElement<ServiceResponse> createAddOrEditPurchaseOrderItemsResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_AddOrEditPurchaseOrderItemsResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "CreateSaleOrderItemAlternateResponse")
    public JAXBElement<ServiceResponse> createCreateSaleOrderItemAlternateResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_CreateSaleOrderItemAlternateResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "AcceptSaleOrderItemAlternateResponse")
    public JAXBElement<ServiceResponse> createAcceptSaleOrderItemAlternateResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_AcceptSaleOrderItemAlternateResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "EditSaleOrderMetadataResponse")
    public JAXBElement<ServiceResponse> createEditSaleOrderMetadataResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_EditSaleOrderMetadataResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "CreateCustomerResponse")
    public JAXBElement<ServiceResponse> createCreateCustomerResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_CreateCustomerResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "EditCustomerResponse")
    public JAXBElement<ServiceResponse> createEditCustomerResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_EditCustomerResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "UpdateTrackingStatusResponse")
    public JAXBElement<ServiceResponse> createUpdateTrackingStatusResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_UpdateTrackingStatusResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "ClosePurchaseOrderResponse")
    public JAXBElement<ServiceResponse> createClosePurchaseOrderResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_ClosePurchaseOrderResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "EditVendorItemTypeRequest")
    public JAXBElement<VendorItemType> createEditVendorItemTypeRequest(VendorItemType value) {
        return new JAXBElement<VendorItemType>(_EditVendorItemTypeRequest_QNAME, VendorItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "EditVendorItemTypeResponse")
    public JAXBElement<ServiceResponse> createEditVendorItemTypeResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_EditVendorItemTypeResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "EditSaleOrderItemMetadataResponse")
    public JAXBElement<ServiceResponse> createEditSaleOrderItemMetadataResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_EditSaleOrderItemMetadataResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "EditScriptConfigResponse")
    public JAXBElement<ServiceResponse> createEditScriptConfigResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_EditScriptConfigResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "CreateVendorResponse")
    public JAXBElement<ServiceResponse> createCreateVendorResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_CreateVendorResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "EditVendorResponse")
    public JAXBElement<ServiceResponse> createEditVendorResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_EditVendorResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "AddOrEditItemLabelsResponse")
    public JAXBElement<ServiceResponse> createAddOrEditItemLabelsResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_AddOrEditItemLabelsResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "VerifySaleOrderResponse")
    public JAXBElement<ServiceResponse> createVerifySaleOrderResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_VerifySaleOrderResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniware.unicommerce.com/services/", name = "MarkItemDamagedOutboundQCResponse")
    public JAXBElement<ServiceResponse> createMarkItemDamagedOutboundQCResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_MarkItemDamagedOutboundQCResponse_QNAME, ServiceResponse.class, null, value);
    }

}
