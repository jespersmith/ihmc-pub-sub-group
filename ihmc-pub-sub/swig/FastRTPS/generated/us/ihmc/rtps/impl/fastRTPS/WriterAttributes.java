/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package us.ihmc.rtps.impl.fastRTPS;

public class WriterAttributes {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected WriterAttributes(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(WriterAttributes obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FastRTPSJNI.delete_WriterAttributes(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public WriterAttributes() {
    this(FastRTPSJNI.new_WriterAttributes(), true);
  }

  public void setEndpoint(EndpointAttributes value) {
    FastRTPSJNI.WriterAttributes_endpoint_set(swigCPtr, this, EndpointAttributes.getCPtr(value), value);
  }

  public EndpointAttributes getEndpoint() {
    long cPtr = FastRTPSJNI.WriterAttributes_endpoint_get(swigCPtr, this);
    return (cPtr == 0) ? null : new EndpointAttributes(cPtr, false);
  }

  public void setTimes(WriterTimes value) {
    FastRTPSJNI.WriterAttributes_times_set(swigCPtr, this, WriterTimes.getCPtr(value), value);
  }

  public WriterTimes getTimes() {
    long cPtr = FastRTPSJNI.WriterAttributes_times_get(swigCPtr, this);
    return (cPtr == 0) ? null : new WriterTimes(cPtr, false);
  }

  public void setMode(RTPSWriterPublishMode value) {
    FastRTPSJNI.WriterAttributes_mode_set(swigCPtr, this, value.swigValue());
  }

  public RTPSWriterPublishMode getMode() {
    return RTPSWriterPublishMode.swigToEnum(FastRTPSJNI.WriterAttributes_mode_get(swigCPtr, this));
  }

  public void setThroughputController(ThroughputControllerDescriptor value) {
    FastRTPSJNI.WriterAttributes_throughputController_set(swigCPtr, this, ThroughputControllerDescriptor.getCPtr(value), value);
  }

  public ThroughputControllerDescriptor getThroughputController() {
    long cPtr = FastRTPSJNI.WriterAttributes_throughputController_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ThroughputControllerDescriptor(cPtr, false);
  }

  public void setDisableHeartbeatPiggyback(boolean value) {
    FastRTPSJNI.WriterAttributes_disableHeartbeatPiggyback_set(swigCPtr, this, value);
  }

  public boolean getDisableHeartbeatPiggyback() {
    return FastRTPSJNI.WriterAttributes_disableHeartbeatPiggyback_get(swigCPtr, this);
  }

}
