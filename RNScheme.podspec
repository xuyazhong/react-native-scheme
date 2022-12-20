
Pod::Spec.new do |s|
  s.name         = "react-native-scheme"
  s.version      = "1.0.0"
  s.summary      = "eact-native-scheme"
  s.description  = <<-DESC
                  RNScheme
                   DESC
  s.homepage     = "https://github.com/xuyazhong/react-native-scheme"
  s.license      = "MIT"
  s.author             = { "xuyazhong" => "xuyazhong@foxmail.com" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/xuyazhong/react-native-scheme.git", :tag => "main" }
  s.source_files  = "ios/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"

end

  