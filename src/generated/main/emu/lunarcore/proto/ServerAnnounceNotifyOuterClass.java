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

public final class ServerAnnounceNotifyOuterClass {
  /**
   * Protobuf type {@code ServerAnnounceNotify}
   */
  public static final class ServerAnnounceNotify extends ProtoMessage<ServerAnnounceNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated .AnnounceData announce_data_list = 6;</code>
     */
    private final RepeatedMessage<AnnounceDataOuterClass.AnnounceData> announceDataList = RepeatedMessage.newEmptyInstance(AnnounceDataOuterClass.AnnounceData.getFactory());

    private ServerAnnounceNotify() {
    }

    /**
     * @return a new empty instance of {@code ServerAnnounceNotify}
     */
    public static ServerAnnounceNotify newInstance() {
      return new ServerAnnounceNotify();
    }

    /**
     * <code>repeated .AnnounceData announce_data_list = 6;</code>
     * @return whether the announceDataList field is set
     */
    public boolean hasAnnounceDataList() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated .AnnounceData announce_data_list = 6;</code>
     * @return this
     */
    public ServerAnnounceNotify clearAnnounceDataList() {
      bitField0_ &= ~0x00000001;
      announceDataList.clear();
      return this;
    }

    /**
     * <code>repeated .AnnounceData announce_data_list = 6;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableAnnounceDataList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<AnnounceDataOuterClass.AnnounceData> getAnnounceDataList() {
      return announceDataList;
    }

    /**
     * <code>repeated .AnnounceData announce_data_list = 6;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<AnnounceDataOuterClass.AnnounceData> getMutableAnnounceDataList() {
      bitField0_ |= 0x00000001;
      return announceDataList;
    }

    /**
     * <code>repeated .AnnounceData announce_data_list = 6;</code>
     * @param value the announceDataList to add
     * @return this
     */
    public ServerAnnounceNotify addAnnounceDataList(
        final AnnounceDataOuterClass.AnnounceData value) {
      bitField0_ |= 0x00000001;
      announceDataList.add(value);
      return this;
    }

    /**
     * <code>repeated .AnnounceData announce_data_list = 6;</code>
     * @param values the announceDataList to add
     * @return this
     */
    public ServerAnnounceNotify addAllAnnounceDataList(
        final AnnounceDataOuterClass.AnnounceData... values) {
      bitField0_ |= 0x00000001;
      announceDataList.addAll(values);
      return this;
    }

    @Override
    public ServerAnnounceNotify copyFrom(final ServerAnnounceNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        announceDataList.copyFrom(other.announceDataList);
      }
      return this;
    }

    @Override
    public ServerAnnounceNotify mergeFrom(final ServerAnnounceNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasAnnounceDataList()) {
        getMutableAnnounceDataList().addAll(other.announceDataList);
      }
      return this;
    }

    @Override
    public ServerAnnounceNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      announceDataList.clear();
      return this;
    }

    @Override
    public ServerAnnounceNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      announceDataList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ServerAnnounceNotify)) {
        return false;
      }
      ServerAnnounceNotify other = (ServerAnnounceNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasAnnounceDataList() || announceDataList.equals(other.announceDataList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < announceDataList.length(); i++) {
          output.writeRawByte((byte) 50);
          output.writeMessageNoTag(announceDataList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * announceDataList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(announceDataList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ServerAnnounceNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 50: {
            // announceDataList
            tag = input.readRepeatedMessage(announceDataList, tag);
            bitField0_ |= 0x00000001;
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
        output.writeRepeatedMessage(FieldNames.announceDataList, announceDataList);
      }
      output.endObject();
    }

    @Override
    public ServerAnnounceNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1895739121:
          case 121672637: {
            if (input.isAtField(FieldNames.announceDataList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(announceDataList);
                bitField0_ |= 0x00000001;
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
    public ServerAnnounceNotify clone() {
      return new ServerAnnounceNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ServerAnnounceNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ServerAnnounceNotify(), data).checkInitialized();
    }

    public static ServerAnnounceNotify parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ServerAnnounceNotify(), input).checkInitialized();
    }

    public static ServerAnnounceNotify parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new ServerAnnounceNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating ServerAnnounceNotify messages
     */
    public static MessageFactory<ServerAnnounceNotify> getFactory() {
      return ServerAnnounceNotifyFactory.INSTANCE;
    }

    private enum ServerAnnounceNotifyFactory implements MessageFactory<ServerAnnounceNotify> {
      INSTANCE;

      @Override
      public ServerAnnounceNotify create() {
        return ServerAnnounceNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName announceDataList = FieldName.forField("announceDataList", "announce_data_list");
    }
  }
}
