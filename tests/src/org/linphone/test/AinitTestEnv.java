package org.linphone.test;

import junit.framework.Assert;

import org.linphone.core.LinphoneCore.RegistrationState;

import android.test.suitebuilder.annotation.LargeTest;
import android.test.suitebuilder.annotation.MediumTest;
import android.test.suitebuilder.annotation.SmallTest;

/**
 * @author Sylvain Berfini
 */
public class AinitTestEnv extends SampleTest {

	@SmallTest
	@MediumTest
	@LargeTest
	public void testAInitLinphoneCore() {		
		LinphoneTestManager.createAndStart(aContext, iContext);
		
		solo.sleep(2000);
		Assert.assertEquals(RegistrationState.RegistrationOk, LinphoneTestManager.getLc().getProxyConfigList()[0].getState());
	}
	
}
