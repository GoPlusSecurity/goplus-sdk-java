import io.gopluslabs.client.ApiException;
import io.gopluslabs.client.GoPlusClient;
import io.gopluslabs.client.auth.SignatureOauth;
import io.gopluslabs.client.request.*;
import org.junit.Test;

public class GoPlusClientTest {


    private static final String accessToken = "";


    @Test
    public void getAccessToken() throws ApiException {

        String appKey = "";
        Long time = System.currentTimeMillis() / 1000;
        String appSecret = "";
        String sign = SignatureOauth.signatureSha1(appKey, time, appSecret);

        AccessTokenRequest of = AccessTokenRequest.of(appKey, sign, time);

        System.out.println(GoPlusClient.getAccessToken(of));
    }


    @Test
    public void supportedChains() throws ApiException {
        SupportedChainsRequest addressSecurity = SupportedChainsRequest.of(
                "address_security",
                accessToken
        );
        System.out.println(GoPlusClient.supportedChains(addressSecurity));
    }

    @Test
    public void tokenSecurity() throws ApiException {
        TokenSecurityRequest of = TokenSecurityRequest.of(
                "1",
                "0x408e41876cccdc0f92210600ef50372656052a38",
                1000
        );
        System.out.println(GoPlusClient.tokenSecurity(of));
    }

    @Test
    public void addressSecurity() throws ApiException {
        AddressSecurityRequest of = AddressSecurityRequest.of(
                "1",
                "0x408e41876cccdc0f92210600ef50372656052a38",
                1000
        );
        System.out.println(GoPlusClient.addressSecurity(of));
    }

    @Test
    public void approvalSecurity() throws ApiException {
        ApprovalSecurityRequest of = ApprovalSecurityRequest.of(
                "1",
                "0x408e41876cccdc0f92210600ef50372656052a38",
                1000
        );
        System.out.println(GoPlusClient.approvalSecurity(of));
    }


    @Test
    public void erc20ApprovalSecurity() throws ApiException {
        Erc20ApprovalSecurityRequest of = Erc20ApprovalSecurityRequest.of(
                "56",
                "0xd018e2b543a2669410537f96293590138cacedf3",
                1000
        );
        System.out.println(GoPlusClient.erc20ApprovalSecurity(of));
    }


    @Test
    public void erc721ApprovalSecurity() throws ApiException {
        Erc721ApprovalSecurityRequest of = Erc721ApprovalSecurityRequest.of(
                "1",
                "0xd95dbdab08a9fed2d71ac9c3028aac40905d8cf3",
                5000
        );
        System.out.println(GoPlusClient.erc721ApprovalSecurity(of));
    }

    @Test
    public void erc1155ApprovalSecurity() throws ApiException {
        Erc1155ApprovalSecurityRequest of = Erc1155ApprovalSecurityRequest.of(
                "56",
                "0xb0dccbb9c4a65a94a41a0165aaea79c8b2fc54ce",
                1000
        );
        System.out.println(GoPlusClient.erc1155ApprovalSecurity(of));
    }

    @Test
    public void inputDecode() throws ApiException {
        InputDecodeRequest of = InputDecodeRequest.of(
                "56",
                "0x10ED43C718714eb63d5aA57B78B54704E256024E",
                    "0x18cbafe500000000000000000000000000000000000000000000018d3f36640ede281bf40000000000000000000000000000000000000000000000001ea33680437e6bcd00000000000000000000000000000000000000000000000000000000000000a00000000000000000000000000c3289e4bfb8868c242833479232ff0ee4efae7800000000000000000000000000000000000000000000000000000000638f084b000000000000000000000000000000000000000000000000000000000000000200000000000000000000000031a9975f71f53d5cdeb4bf4a48b3857e3827d487000000000000000000000000bb4cdb9cbd36b01bd1cbaebf2de08d9173bc095c",
                "000",
                0
        );
        System.out.println(GoPlusClient.inputDecode(of));
    }

    @Test
    public void nftSecurity() throws ApiException {
        NftSecurityRequest of = NftSecurityRequest.of(
                "1",
                "0x11450058d796b02eb53e65374be59cff65d3fe7f",
                null,
                10000
        );
        System.out.println(GoPlusClient.nftSecurity(of));
    }

    @Test
    public void dappSecurity() throws ApiException {
        DappSecurityRequest of = DappSecurityRequest.of(
                "https://for.tube",
                1000
        );
        System.out.println(GoPlusClient.dappSecurity(of));
    }

    @Test
    public void phishingSite() throws ApiException {
        PhishingSiteRequest of = PhishingSiteRequest.of(
                "https://xn--cm-68s.cc/",
                1000
        );
        System.out.println(GoPlusClient.phishingSite(of));
    }

    @Test
    public void rugpullDetecting() throws ApiException {
        DefiInfoRequest of = DefiInfoRequest.of(
                "1",
                "0x11450058d796b02eb53e65374be59cff65d3fe7f"
        );
        System.out.println(GoPlusClient.rugpullDetecting(of));
    }

}
