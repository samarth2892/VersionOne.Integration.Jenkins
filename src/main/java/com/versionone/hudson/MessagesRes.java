package com.versionone.hudson;


import org.jvnet.localizer.Localizable;
import org.jvnet.localizer.ResourceBundleHolder;

public class MessagesRes {

    private final static ResourceBundleHolder holder = ResourceBundleHolder.get(MessagesRes.class);

    public static String VersionOne_Notifier() {
        return holder.format("VersionOne.Notifier");
    }

    public static Localizable _VersionOne_Notifier() {
        return new Localizable(holder, "VersionOne.Notifier");
    }

	public static String connectionValid() {
		return holder.format("connectionValid");
	}

	public static String connectionFailedPath() {
		return holder.format("connectionFailedPath");
	}

	public static String connectionFailedUsername() {
		return holder.format("connectionFailedUsername");
	}

	public static String pathCannotBeEmpty() {
		return holder.format("pathCannotBeEmpty");
	}

	public static String pathWrong() {
		return holder.format("pathWrong");
	}
}