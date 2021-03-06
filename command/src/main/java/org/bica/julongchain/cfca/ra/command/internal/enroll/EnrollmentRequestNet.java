package org.bica.julongchain.cfca.ra.command.internal.enroll;

import java.util.Objects;

/**
 * @author zhangchong
 * @create 2018/5/11
 * @Description enroll接口网络请求参数,用于调用服务器Restful接口
 * @CodeReviewer
 * @since v3.0.0
 */
public class EnrollmentRequestNet {
    /**
     * A encoded string containing the CSR (Certificate Signing Request) based
     * on PKCS #10.
     */
    private final String request;
    /**
     * The username of the signing profile to use when issuing the certificate.
     */
    private final String profile;
    /**
     * The label used in HSM operations
     */
    private final String label;
    /**
     * Name of the CA to direct traffic to within server.
     */
    private final String caname;

    private EnrollmentRequestNet(Builder builder) {
        this.request = builder.request;
        this.profile = builder.profile;
        this.label = builder.label;
        this.caname = builder.caname;
    }

    String getRequest() {
        return request;
    }

    String getProfile() {
        return profile;
    }

    String getLabel() {
        return label;
    }

    String getCaname() {
        return caname;
    }

   
    

    @Override
    public String toString() {
        StringBuilder builder2 = new StringBuilder();
        builder2.append("EnrollmentRequestNet [request=");
        builder2.append(request);
        builder2.append(", profile=");
        builder2.append(profile);
        builder2.append(", label=");
        builder2.append(label);
        builder2.append(", caname=");
        builder2.append(caname);
        builder2.append("]");
        return builder2.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        EnrollmentRequestNet that = (EnrollmentRequestNet) o;
        return Objects.equals(request, that.request) &&
                Objects.equals(profile, that.profile) &&
                Objects.equals(label, that.label) &&
                Objects.equals(caname, that.caname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(request, profile, label, caname);
    }

    public static class Builder {
        // Required
        /**
         * A encoded string containing the CSR (Certificate Signing Request) based on PKCS #10.
         */
        private final String request;
        /**
         * The username of the signing profile to use when issuing the certificate.
         */
        private final String profile;
        /**
         * Name of the CA to direct traffic to within server.
         */
        private final String caname;

        /**
         * Optional:The label used in HSM operations
         */
        private String label = "";

        public Builder(String request, String profile, String caname) {
            this.request = request;
            this.profile = profile;
            this.caname = caname;
        }

        Builder label(String label) {
            this.label = label;
            return this;
        }

        public EnrollmentRequestNet build() {
            return new EnrollmentRequestNet(this);
        }
    }
}
