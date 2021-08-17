## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```
-- 기능요구사항
- [ ] 커스텀 구분자로 로 문자열을 분리(//”와 “\n” 문자 사이에 커스텀 구분자를 지정)
- [ ] 구분자로 분리된 숫자들의 합을 반환
- [ ] 빈 문자열일 경우 0을 반한
- [ ] 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환
- [ ] 문자열 이외의 값 또는 음수를 전당할 경우 Exception
  
- [x] 기본구분자,커스텀구분 를 가진 구분자그룹 객체를 가진다.
  - [x] 구분자그룹객체에서 split 표현식을 만든다.
- [x] 구분자로 분리된 숫자들을 가진 객체를 가진다.
  - [x] 숫자들의 합을 반환 
- “” => 0, 
- "1,2" => 3, 
- "1,2,3" => 6, 
- “1,2:3” => 6
- "/;\n1;2;3" =>6