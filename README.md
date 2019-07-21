# DimDialog
A library that takes the standard android dialog to the next level.

## Step 1

Add this in your root `build.gradle(Project:...)`

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

## Step 2

Add this to your root `build.gradle(Module:..)`

```gradle
dependencies {
	...
	implementation 'com.github.talhavci:DimDialog:0.1.0'
}
```

<h2>DimDialog Example</h2>

```diff
 new DimDialog(this).setTitle("DimDialog Title")
            .setMessage("DimDialog message. Something write...")
            .setCancelable(true)
            .setIcon(DimDialogIcon.INFO)
            .setNegativeButtonColor(R.color.red)
            .setPositiveButtonColor(R.color.colorPrimaryDark)
            .setNormalButtonColor(R.color.colorPrimaryDark)
            .setButtonNormalListener("Remind Me Later", new DimDialogClickListener() {
                @Override
                public void onClick() {
                    // do something
                }
            }).setButtonPositiveListener("OK", new DimDialogClickListener() {
                @Override
                public void onClick() {
                    // do something
                }
            }).setButtonNegativeListener("Cancel", new DimDialogClickListener() {
                @Override
                public void onClick() {
                    // do something
                }
            }).show();
```

## Screenshots

![dimdialog](https://user-images.githubusercontent.com/53127668/61595378-1fcc3e80-abff-11e9-9401-2c6fc9fb8966.png)
