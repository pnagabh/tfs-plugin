package hudson.plugins.tfs.rm;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Implements ReleaseWebHookStatus.
 * @author kasubram
 */
public class ReleaseWebHookStatus {

    private final String payloadUrl;
    private final String timeStamp;
    private final int status;
    private String errorMessage;

    public ReleaseWebHookStatus(final String payloadUrl, final int status) {
        this.payloadUrl = payloadUrl;
        this.status = status;
        this.timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    }

    public ReleaseWebHookStatus(final String payloadUrl, final int status, final String errorMessage) {
        this(payloadUrl, status);
        this.errorMessage = errorMessage;
    }

    public String getPayloadUrl() {
        return this.payloadUrl;
    }

    public int getStatus() {
        return this.status;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getTimeStamp() {
        return this.timeStamp;
    }
}
