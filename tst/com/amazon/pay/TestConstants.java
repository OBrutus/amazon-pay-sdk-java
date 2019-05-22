/**
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazon.pay;

public class TestConstants {

    public static final String billingAgreementId = "CTEST_AMAZON_BILLING_AGREEMENT_ID";
    public static final String billinAgreementIdDraft = "TEST_AMAZON_BILLING_AGREEMENT_ID_DRAFT";
    public static final String addressConsentToken = "TEST_ADDRESS_CONSENT_TOKEN";
    public static final String clientId = "TEST_CLIENT_ID";
    public static final String tokenInfoResponse = "{\"aud\":\"TEST_CLIENT_ID\",\"user_id\":\"amzn1.account.AF5W6J2OG52NKFJGEN52GEZ5CWFQ\",\"iss\":\"https://www.amazon.com\",\"exp\":2370,\"app_id\":\"amzn1.application.5286e3c9cac24d8188908b500f4a05a5\",\"iat\":1446510240}";
    public static final String userProfileErrorResponse = "{\"error_description\":\"The request has an invalid parameter : access_token\",\"error\":\"invalid_token\"}";
    public static final String userInfoResponse = "{\"user_id\":\"amzn1.account.AF5W6J2OG52NKFJGEN52GEZ5CWFQ\",\"name\":\"Test Buyer\",\"email\":\"testbuyer2@amazon.com\"}";
    public static final String merchantId = "TEST_MERCHANT_ID";
    public static final String accessKey = "TEST_ACCESS_KEY";
    public static final String secretKey = "TEST_SECRET_KEY";
    public static final String region = "us";
    public static final String sandbox_mode = "true";
    public static final String timeStamp = "2015-12-31T23:59:58Z";
    public static final String urlEncoded_TimeStamp = "2015-12-31T23%3A59%3A58Z";
    public static final String platformId = "A11WKBU7ADWTAU";
    public static final String MWS_URL = "https://mws.amazonservices.com/OffAmazonPayments_Sandbox/2013-01-01";
    public static final String mwsAuthToken = "TEST_MWS_AUTH_TOKEN";
    public static final String sampletext = "testNote";
    public static final String storeName = "TestStore";
    public static final String sellerBillingAgreementId = "TEST_BILLING_AGREEMENT_ID";
    public static final String softDescriptor = "AMZNTestTest";
    public static final String amazonOrderReferenceId = "AMAZON_ORDER_REFERENCE_ID";
    public static final String Endpoint500 = "https://www.example.com/";
    public static final String providerSellerId = "TEST_PROVIDER_SELLER_ID";
    public static final String overrideSellerId = "OVERRIDE_SELLER_ID";
    public static final String providerCreditId = "TEST_PROVIDER_CREDIT";
    public static final String reversalProviderCreditId = "TEST_PROVIDER_REVERSAL_CREDIT";
    public static final String reversalProviderCreditReferenceId = "TEST_PROVIDER_REVERSAL_CREDIT_REFERENCE_ID";
    public static final String reversalProviderAmount = "5";
    public static final String creditReferenceReversalId = "TEST_CREDIT_REFERENCE_REVERSAL_ID";
    public static final String authorizationReferenceId = "TEST_AUTHORIZATION_REFERENCE_ID";
    public static final String userProfileURL = "https://api.sandbox.amazon.com/user/profile";
    public static final String tokenInfoURL = "https://api.sandbox.amazon.com/auth/o2/tokeninfo?access_token=";
    public static final String OVERRIDE_SERVICE_URL = "https://override.service.test";
    public static final String OVERRIDE_PROFILE_URL = "https://override.profile.test";
    public static final String queryId = "OR-12345";
    public static final String queryIdType = "SellerOrderId";
    public static final int pageSize = 5;
    public static final String nextPageToken = "1eUc0QkJMVnJpcGgrbDNHclpIUT09IiwibWFya2V0cGxhY2VJZCI6IkEzQlhCMFlOM1hIMTdIIn0=";
    public static final String SUPPLEMENTARY_DATA = "{\"AirlineMetaData\" : {\"version\": 1.0, \"airlineCode\": \"WN\", \"flightDate\": \"2018-03-24T20:29:19.22Z\", \"departureAirport\": \"CDG\", \"destinationAirport\": \"LUX\", \"bookedLastTime\": -1, \"classOfTravel\": \"F\", \"passengers\": {\"numberOfPassengers\": 4, \"numberOfChildren\": 1, \"numberOfInfants\": 1 }}, \"AccommodationMetaData\": {\"version\": 1.0, \"startDate\": \"2018-03-24T20:29:19.22Z\", \"endDate\": \"2018-03-24T20:29:19.22Z\", \"lengthOfStay\": 5, \"numberOfGuests\": 4, \"class\": \"Standard\", \"starRating\": 5, \"bookedLastTime\": -1 }, \"OrderMetaData\": {\"version\": 1.0, \"numberOfItems\": 3, \"type\": \"Digital\" }, \"BuyerMetaData\": {\"version\" : 1.0, \"isFirstTimeCustomer\" : true, \"numberOfPastPurchases\" : 2, \"numberOfDisputedPurchases\" : 3, \"hasOpenDispute\" : true, \"riskScore\" : 0.75 }}";
    public static final String AUTHORIZE_AMOUNT = "0.01";
    public static final String SUCCESS_URL = "https://pay.amazon.com/success.html";
    public static final String FAILURE_URL = "https://pay.amazon.com/failure.html";

}
