/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package us.ihmc.rtps.impl.fastRTPS;

public class PortParameters {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected PortParameters(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PortParameters obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        FastRTPSJNI.delete_PortParameters(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PortParameters() {
    this(FastRTPSJNI.new_PortParameters(), true);
  }

  public long getMulticastPort(long domainId) {
    return FastRTPSJNI.PortParameters_getMulticastPort(swigCPtr, this, domainId);
  }

  public long getUnicastPort(long domainId, long RTPSParticipantID) {
    return FastRTPSJNI.PortParameters_getUnicastPort(swigCPtr, this, domainId, RTPSParticipantID);
  }

  public void setPortBase(int value) {
    FastRTPSJNI.PortParameters_portBase_set(swigCPtr, this, value);
  }

  public int getPortBase() {
    return FastRTPSJNI.PortParameters_portBase_get(swigCPtr, this);
  }

  public void setDomainIDGain(int value) {
    FastRTPSJNI.PortParameters_domainIDGain_set(swigCPtr, this, value);
  }

  public int getDomainIDGain() {
    return FastRTPSJNI.PortParameters_domainIDGain_get(swigCPtr, this);
  }

  public void setParticipantIDGain(int value) {
    FastRTPSJNI.PortParameters_participantIDGain_set(swigCPtr, this, value);
  }

  public int getParticipantIDGain() {
    return FastRTPSJNI.PortParameters_participantIDGain_get(swigCPtr, this);
  }

  public void setOffsetd0(int value) {
    FastRTPSJNI.PortParameters_offsetd0_set(swigCPtr, this, value);
  }

  public int getOffsetd0() {
    return FastRTPSJNI.PortParameters_offsetd0_get(swigCPtr, this);
  }

  public void setOffsetd1(int value) {
    FastRTPSJNI.PortParameters_offsetd1_set(swigCPtr, this, value);
  }

  public int getOffsetd1() {
    return FastRTPSJNI.PortParameters_offsetd1_get(swigCPtr, this);
  }

  public void setOffsetd2(int value) {
    FastRTPSJNI.PortParameters_offsetd2_set(swigCPtr, this, value);
  }

  public int getOffsetd2() {
    return FastRTPSJNI.PortParameters_offsetd2_get(swigCPtr, this);
  }

  public void setOffsetd3(int value) {
    FastRTPSJNI.PortParameters_offsetd3_set(swigCPtr, this, value);
  }

  public int getOffsetd3() {
    return FastRTPSJNI.PortParameters_offsetd3_get(swigCPtr, this);
  }

}
