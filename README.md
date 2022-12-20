
# react-native-scheme

## Getting started

`$ npm install react-native-scheme --save`

### Mostly automatic installation

`$ react-native link react-native-scheme`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-scheme` and add `RNScheme.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNScheme.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.xuyazhong.scheme.RNSchemePackage;` to the imports at the top of the file
  - Add `new RNSchemePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-scheme'
  	project(':react-native-scheme').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-scheme/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-scheme')
  	```


## Usage
```javascript
import RNScheme from 'react-native-scheme';

// TODO: What to do with the module?
RNScheme;
```
  