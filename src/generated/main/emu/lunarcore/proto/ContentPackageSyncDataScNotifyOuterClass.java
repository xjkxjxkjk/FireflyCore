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

public final class ContentPackageSyncDataScNotifyOuterClass {
  /**
   * <pre>
   *  JCGIEPFFKEG
   * </pre>
   *
   * Protobuf type {@code ContentPackageSyncDataScNotify}
   */
  public static final class ContentPackageSyncDataScNotify extends ProtoMessage<ContentPackageSyncDataScNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .ContentPackageData data = 5;</code>
     */
    private final ContentPackageDataOuterClass.ContentPackageData data = ContentPackageDataOuterClass.ContentPackageData.newInstance();

    private ContentPackageSyncDataScNotify() {
    }

    /**
     * <pre>
     *  JCGIEPFFKEG
     * </pre>
     *
     * @return a new empty instance of {@code ContentPackageSyncDataScNotify}
     */
    public static ContentPackageSyncDataScNotify newInstance() {
      return new ContentPackageSyncDataScNotify();
    }

    /**
     * <code>optional .ContentPackageData data = 5;</code>
     * @return whether the data field is set
     */
    public boolean hasData() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .ContentPackageData data = 5;</code>
     * @return this
     */
    public ContentPackageSyncDataScNotify clearData() {
      bitField0_ &= ~0x00000001;
      data.clear();
      return this;
    }

    /**
     * <code>optional .ContentPackageData data = 5;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableData()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public ContentPackageDataOuterClass.ContentPackageData getData() {
      return data;
    }

    /**
     * <code>optional .ContentPackageData data = 5;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public ContentPackageDataOuterClass.ContentPackageData getMutableData() {
      bitField0_ |= 0x00000001;
      return data;
    }

    /**
     * <code>optional .ContentPackageData data = 5;</code>
     * @param value the data to set
     * @return this
     */
    public ContentPackageSyncDataScNotify setData(
        final ContentPackageDataOuterClass.ContentPackageData value) {
      bitField0_ |= 0x00000001;
      data.copyFrom(value);
      return this;
    }

    @Override
    public ContentPackageSyncDataScNotify copyFrom(final ContentPackageSyncDataScNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        data.copyFrom(other.data);
      }
      return this;
    }

    @Override
    public ContentPackageSyncDataScNotify mergeFrom(final ContentPackageSyncDataScNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasData()) {
        getMutableData().mergeFrom(other.data);
      }
      return this;
    }

    @Override
    public ContentPackageSyncDataScNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      data.clear();
      return this;
    }

    @Override
    public ContentPackageSyncDataScNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      data.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof ContentPackageSyncDataScNotify)) {
        return false;
      }
      ContentPackageSyncDataScNotify other = (ContentPackageSyncDataScNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasData() || data.equals(other.data));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 42);
        output.writeMessageNoTag(data);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(data);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public ContentPackageSyncDataScNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 42: {
            // data
            input.readMessage(data);
            bitField0_ |= 0x00000001;
            tag = input.readTag();
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
        output.writeMessage(FieldNames.data, data);
      }
      output.endObject();
    }

    @Override
    public ContentPackageSyncDataScNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 3076010: {
            if (input.isAtField(FieldNames.data)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(data);
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
    public ContentPackageSyncDataScNotify clone() {
      return new ContentPackageSyncDataScNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static ContentPackageSyncDataScNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new ContentPackageSyncDataScNotify(), data).checkInitialized();
    }

    public static ContentPackageSyncDataScNotify parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new ContentPackageSyncDataScNotify(), input).checkInitialized();
    }

    public static ContentPackageSyncDataScNotify parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new ContentPackageSyncDataScNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating ContentPackageSyncDataScNotify messages
     */
    public static MessageFactory<ContentPackageSyncDataScNotify> getFactory() {
      return ContentPackageSyncDataScNotifyFactory.INSTANCE;
    }

    private enum ContentPackageSyncDataScNotifyFactory implements MessageFactory<ContentPackageSyncDataScNotify> {
      INSTANCE;

      @Override
      public ContentPackageSyncDataScNotify create() {
        return ContentPackageSyncDataScNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName data = FieldName.forField("data");
    }
  }
}
