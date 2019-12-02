/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package us.ihmc.rtps.impl.fastRTPS;

public class ReaderTimes {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ReaderTimes(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ReaderTimes obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FastRTPSJNI.delete_ReaderTimes(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ReaderTimes() {
    this(FastRTPSJNI.new_ReaderTimes(), true);
  }

  public void setInitialAcknackDelay(Time_t value) {
    FastRTPSJNI.ReaderTimes_initialAcknackDelay_set(swigCPtr, this, Time_t.getCPtr(value), value);
  }

  public Time_t getInitialAcknackDelay() {
    long cPtr = FastRTPSJNI.ReaderTimes_initialAcknackDelay_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Time_t(cPtr, false);
  }

  public void setHeartbeatResponseDelay(Time_t value) {
    FastRTPSJNI.ReaderTimes_heartbeatResponseDelay_set(swigCPtr, this, Time_t.getCPtr(value), value);
  }

  public Time_t getHeartbeatResponseDelay() {
    long cPtr = FastRTPSJNI.ReaderTimes_heartbeatResponseDelay_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Time_t(cPtr, false);
  }

}
