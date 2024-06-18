// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedMessage;

public final class GetTutorialGuideScRspOuterClass {
  /**
   * Protobuf type {@code GetTutorialGuideScRsp}
   */
  public static final class GetTutorialGuideScRsp extends ProtoMessage<GetTutorialGuideScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 4;</code>
     */
    private int retcode;

    /**
     * <code>repeated .TutorialGuide tutorial_guide_list = 9;</code>
     */
    private final RepeatedMessage<TutorialGuideOuterClass.TutorialGuide> tutorialGuideList = RepeatedMessage.newEmptyInstance(TutorialGuideOuterClass.TutorialGuide.getFactory());

    private GetTutorialGuideScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetTutorialGuideScRsp}
     */
    public static GetTutorialGuideScRsp newInstance() {
      return new GetTutorialGuideScRsp();
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return this
     */
    public GetTutorialGuideScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 4;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetTutorialGuideScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated .TutorialGuide tutorial_guide_list = 9;</code>
     * @return whether the tutorialGuideList field is set
     */
    public boolean hasTutorialGuideList() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated .TutorialGuide tutorial_guide_list = 9;</code>
     * @return this
     */
    public GetTutorialGuideScRsp clearTutorialGuideList() {
      bitField0_ &= ~0x00000002;
      tutorialGuideList.clear();
      return this;
    }

    /**
     * <code>repeated .TutorialGuide tutorial_guide_list = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableTutorialGuideList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<TutorialGuideOuterClass.TutorialGuide> getTutorialGuideList() {
      return tutorialGuideList;
    }

    /**
     * <code>repeated .TutorialGuide tutorial_guide_list = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<TutorialGuideOuterClass.TutorialGuide> getMutableTutorialGuideList() {
      bitField0_ |= 0x00000002;
      return tutorialGuideList;
    }

    /**
     * <code>repeated .TutorialGuide tutorial_guide_list = 9;</code>
     * @param value the tutorialGuideList to add
     * @return this
     */
    public GetTutorialGuideScRsp addTutorialGuideList(
        final TutorialGuideOuterClass.TutorialGuide value) {
      bitField0_ |= 0x00000002;
      tutorialGuideList.add(value);
      return this;
    }

    /**
     * <code>repeated .TutorialGuide tutorial_guide_list = 9;</code>
     * @param values the tutorialGuideList to add
     * @return this
     */
    public GetTutorialGuideScRsp addAllTutorialGuideList(
        final TutorialGuideOuterClass.TutorialGuide... values) {
      bitField0_ |= 0x00000002;
      tutorialGuideList.addAll(values);
      return this;
    }

    @Override
    public GetTutorialGuideScRsp copyFrom(final GetTutorialGuideScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        tutorialGuideList.copyFrom(other.tutorialGuideList);
      }
      return this;
    }

    @Override
    public GetTutorialGuideScRsp mergeFrom(final GetTutorialGuideScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasTutorialGuideList()) {
        getMutableTutorialGuideList().addAll(other.tutorialGuideList);
      }
      return this;
    }

    @Override
    public GetTutorialGuideScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      tutorialGuideList.clear();
      return this;
    }

    @Override
    public GetTutorialGuideScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      tutorialGuideList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetTutorialGuideScRsp)) {
        return false;
      }
      GetTutorialGuideScRsp other = (GetTutorialGuideScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasTutorialGuideList() || tutorialGuideList.equals(other.tutorialGuideList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < tutorialGuideList.length(); i++) {
          output.writeRawByte((byte) 74);
          output.writeMessageNoTag(tutorialGuideList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * tutorialGuideList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(tutorialGuideList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetTutorialGuideScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 74) {
              break;
            }
          }
          case 74: {
            // tutorialGuideList
            tag = input.readRepeatedMessage(tutorialGuideList, tag);
            bitField0_ |= 0x00000002;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedMessage(FieldNames.tutorialGuideList, tutorialGuideList);
      }
      output.endObject();
    }

    @Override
    public GetTutorialGuideScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 515727356:
          case -299913342: {
            if (input.isAtField(FieldNames.tutorialGuideList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(tutorialGuideList);
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public GetTutorialGuideScRsp clone() {
      return new GetTutorialGuideScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetTutorialGuideScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetTutorialGuideScRsp(), data).checkInitialized();
    }

    public static GetTutorialGuideScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetTutorialGuideScRsp(), input).checkInitialized();
    }

    public static GetTutorialGuideScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetTutorialGuideScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetTutorialGuideScRsp messages
     */
    public static MessageFactory<GetTutorialGuideScRsp> getFactory() {
      return GetTutorialGuideScRspFactory.INSTANCE;
    }

    private enum GetTutorialGuideScRspFactory implements MessageFactory<GetTutorialGuideScRsp> {
      INSTANCE;

      @Override
      public GetTutorialGuideScRsp create() {
        return GetTutorialGuideScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName tutorialGuideList = FieldName.forField("tutorialGuideList", "tutorial_guide_list");
    }
  }
}
