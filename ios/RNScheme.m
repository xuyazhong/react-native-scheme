//
//  RNScheme.m
//  xyz
//
//  Created by xuyazhong on 2022/7/12.
//
#import "RNScheme.h"

@implementation RNScheme

- (dispatch_queue_t)methodQueue
{
    return dispatch_get_main_queue();
}
RCT_EXPORT_MODULE()

RCT_EXPORT_METHOD(open:(NSString *)url) {
    
    [[UIApplication sharedApplication] openURL:[NSURL URLWithString:url]
                                       options:@{}
                             completionHandler:^(BOOL success) {
    }];
}

@end
  
