package com.amazonaws.serverless.proxy.model;

public class HttpApiV2Authentication {
    private ClientCert clientCert;

    public ClientCert getClientCert() {
        return clientCert;
    }

    public void setClientCert(ClientCert clientCert) {
        this.clientCert = clientCert;
    }

    public static class ClientCert {

        private String clientCertPem;
        private String issuerDN;
        private String serialNumber;
        private String subjectDN;
        private Validity validity;

        public String getClientCertPem() {
            return clientCertPem;
        }

        public void setClientCertPem(String clientCertPem) {
            this.clientCertPem = clientCertPem;
        }

        public String getIssuerDN() {
            return issuerDN;
        }

        public void setIssuerDN(String issuerDN) {
            this.issuerDN = issuerDN;
        }

        public String getSerialNumber() {
            return serialNumber;
        }

        public void setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
        }

        public String getSubjectDN() {
            return subjectDN;
        }

        public void setSubjectDN(String subjectDN) {
            this.subjectDN = subjectDN;
        }

        public Validity getValidity() {
            return validity;
        }

        public void setValidity(Validity validity) {
            this.validity = validity;
        }

        public static class Validity {

            private String notAfter;
            private String notBefore;

            public String getNotAfter() {
                return notAfter;
            }

            public void setNotAfter(String notAfter) {
                this.notAfter = notAfter;
            }

            public String getNotBefore() {
                return notBefore;
            }

            public void setNotBefore(String notBefore) {
                this.notBefore = notBefore;
            }
        }
    }
}
